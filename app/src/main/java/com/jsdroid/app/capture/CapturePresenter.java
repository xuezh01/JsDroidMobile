package com.jsdroid.app.capture;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.jsdroid.app.capture.node.By;
import com.jsdroid.app.capture.node.Node;
import com.jsdroid.app.capture.node.NodeInfoViewBinder;
import com.jsdroid.app.entity.Capture;
import com.jsdroid.app.jsd.JsdCapture;
import com.jsdroid.mvp.presenter.BasePresenter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

class CapturePresenter extends BasePresenter<CaptureView> {
    private Node root;
    private String lastSearch;
    private List<Node> searchResult;
    private int searchPos;
    private List<Capture> allCapture;
    private Capture current;

    //选择节点
    public void selectNode(NodeInfoViewBinder.TreeItem node) {
        try {
            CaptureView view = getView();
            if (view == null) {
                return;
            }
            //树滑动到指定节点
            view.showTreeSelect(node);
            //显示节点信息
            //截图中显示节点范围
            view.captureImageView.setSelectNode(node.getContent().getNode());
            view.showNodeInfo(node.getContent().getNode());

            //保存选择信息
            Node info = node.getContent().getNode();
            current.selectIndex = info.getSelectIndex();
            JsdCapture.getInstance().update(current, false);
        } catch (Exception e) {
        }
    }

    public void search(String text) {
        if (lastSearch == null || (!lastSearch.equals(text))) {
            lastSearch = text;
            searchPos = 0;
            searchResult = new ArrayList<>();
            searchResult.addAll(root.findNodes(By.textContains(text)));
            searchResult.addAll(root.findNodes(By.clazz(Pattern.compile(".*" + text + ".*"))));
            searchResult.addAll(root.findNodes(By.res(Pattern.compile(".*" + text + ".*"))));
            searchResult.addAll(root.findNodes(By.descContains(text)));

        }
        if (searchResult.size() > 0) {
            Object treeNode = searchResult.get(searchPos++ % searchResult.size()).treeNode;
            if (treeNode instanceof NodeInfoViewBinder.TreeItem) {
                selectNode((NodeInfoViewBinder.TreeItem) treeNode);
            }
        }
    }

    /**
     * 上次显示的截图
     */
    private static long openCaptureId = -1;

    //加载截图信息
    private void loadCapture(Long captureId) {
        root = new Node();
        new Thread(new Runnable() {
            @Override
            public void run() {
                allCapture = JsdCapture.getInstance().list();
                for (Capture capture : allCapture) {
                    if (captureId == null) {
                        if (capture.getId() == openCaptureId) {
                            current = capture;
                        }
                    } else {
                        if (capture.getId().equals(captureId)) {
                            current = capture;
                        }
                    }
                }
                if (current == null) {
                    if (allCapture != null && allCapture.size() > 0) {
                        current = allCapture.get(0);
                    }
                }
                postCheckView(new Check<CaptureView>() {
                    @Override
                    public void ok(CaptureView view) {
                        showCapture();
                    }
                });
            }
        }).start();
    }

    /**
     * 显示当前截图信息
     */
    private void showCapture() {
        if (current == null) {
            return;
        }
        openCaptureId = current.id;
        getView().showTitle(current.name);

        List<Node> nodes = JSON.parseObject(current.getNodes(), new TypeReference<ArrayList<Node>>() {
        });
        root.children = nodes;
        root.setParentAndDepth(0);
        getView().captureImageView.setRoot(root);
        getView().captureImageView.setCapture(current);
        getView().treeViewAdapter.refresh(Arrays.asList(new NodeInfoViewBinder.TreeItem(new NodeInfoViewBinder.NodeInfo(root))));

        Node select = root.get(current.selectIndex);
        selectNode(select);
    }

    //下一个截图
    public void next() {
        if (allCapture == null || allCapture.size() == 0) {
            return;
        }
        int i = allCapture.indexOf(current);
        int pos = ++i % allCapture.size();
        current = allCapture.get(pos);
        showCapture();
    }

    //上一个截图
    public void last() {
        if (allCapture == null || allCapture.size() == 0) {
            return;
        }
        int i = allCapture.indexOf(current);
        int pos = (--i + allCapture.size()) % allCapture.size();
        current = allCapture.get(pos);
        showCapture();
    }

    @Override
    protected void onCreate() {
        super.onCreate();
    }

    public void selectNode(Node node) {
        if (node != null) {
            Object treeNode = node.treeNode;
            if (treeNode instanceof NodeInfoViewBinder.TreeItem) {
                selectNode((NodeInfoViewBinder.TreeItem) treeNode);
            }
        }
    }

    public void setCaptureId(Long captureId) {
        loadCapture(captureId);
    }
}
