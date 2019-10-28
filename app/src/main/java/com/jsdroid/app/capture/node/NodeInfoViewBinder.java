package com.jsdroid.app.capture.node;

import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.jsdroid.app.R;
import com.jsdroid.app.capture.tree.LayoutItemType;
import com.jsdroid.app.capture.tree.TreeNode;
import com.jsdroid.app.capture.tree.TreeViewBinder;

import java.util.List;

/**
 * 截图界面的节点信息树适配器
 */
public class NodeInfoViewBinder extends TreeViewBinder<NodeInfoViewBinder.NodeHolder> {

    @Override
    public NodeHolder provideViewHolder(View itemView) {
        return new NodeHolder(itemView);
    }

    @Override
    public void bindView(NodeHolder holder, int position, TreeNode node) {
        NodeInfo content = (NodeInfo) node.getContent();
        holder.setTextInfo(content.getNode().toString());
        holder.setArrow(node.isExpand());
        holder.showArrow(!node.isLeaf());
        TreeItem item = (TreeItem) node;
        holder.setSelected(item.isSelected());
    }

    @Override
    public int getLayoutId() {
        return R.layout.tree_item_simple;
    }

    public static class NodeHolder extends RecyclerView.ViewHolder {

        public TextView textInfo;
        public ImageView imgArrow;
        public View content;

        public NodeHolder(View itemView) {
            super(itemView);
            textInfo = itemView.findViewById(R.id.text_info);
            imgArrow = itemView.findViewById(R.id.img_arrow);
            content = itemView.findViewById(R.id.content);
            imgArrow.setColorFilter(Color.WHITE);

        }

        public void setArrow(boolean open) {
            if (open) {
                imgArrow.setImageResource(R.drawable.ic_arrow_open);
            } else {
                imgArrow.setImageResource(R.drawable.ic_arrow_close);
            }
        }

        public void showArrow(boolean show) {
            if (show) {
                imgArrow.setVisibility(View.VISIBLE);
            } else {
                imgArrow.setVisibility(View.INVISIBLE);
            }
        }

        public void setTextInfo(String textInfo) {
            this.textInfo.setText(textInfo);
        }

        public void setSelected(boolean selected) {
            if (selected) {
                int color = content.getResources().getColor(R.color.colorPrimary);
                color = color << 8 >> 8;
                color = 0xaa << 24 | color;
                content.setBackgroundColor(color);
            } else {
                content.setBackground(null);
            }
        }
    }

    public static class NodeInfo implements LayoutItemType {
        private Node node;

        public NodeInfo(Node node) {
            this.node = node;
        }

        @Override
        public int getLayoutId() {
            return R.layout.tree_item_simple;
        }

        public Node getNode() {
            return node;
        }
    }

    public static class TreeItem extends TreeNode<NodeInfo> {

        public TreeItem(@NonNull NodeInfo content) {
            super(content);
            content.node.treeNode = this;
            List<Node> children = content.node.children;
            if (children != null) {
                for (Node child : children) {
                    addChild(new TreeItem(new NodeInfo(child)));
                }
            }
            expand();
        }

        private boolean selected;

        public boolean isSelected() {
            return selected;
        }

        public void setSelected(boolean selected) {
            this.selected = selected;
        }

        public TreeItem getRoot() {
            TreeItem parent = (TreeItem) getParent();
            if (parent != null) {
                return parent.getRoot();
            }
            return this;
        }

        public void unSelectAll() {
            List<TreeNode> childList = getChildList();
            for (TreeNode treeNode : childList) {
                if (treeNode instanceof TreeItem) {
                    ((TreeItem) treeNode).unSelectAll();
                }
            }
            setSelected(false);
        }

    }
}
