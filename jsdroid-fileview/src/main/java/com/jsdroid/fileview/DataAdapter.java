package com.jsdroid.fileview;

import android.app.Activity;
import android.content.Context;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class DataAdapter extends BaseAdapter {
    public static abstract class DataHandler {

        public abstract int getLayoutId();

        public abstract boolean canFillData(Object data);

        public abstract void fillData(int pos, Object data, ViewHolder viewHolder,
                                      DataAdapter dataAdapter);

    }
    public static class ViewHolder {

        public static ViewHolder get(DataAdapter dataAdapter, ViewGroup parent,
                                     int layoutId) {
            View contentView = null;
            if (parent.getChildCount() > 0) {
                contentView = parent.getChildAt(0);
            }
            if (contentView != null) {
                ViewHolder vh = (ViewHolder) contentView.getTag();
                if (vh.layoutId == layoutId) {
                    return vh;
                } else {
                    parent.removeAllViews();
                    dataAdapter.addViewHolderCache(vh);
                    vh = dataAdapter.getViewHolderCache(layoutId);
                    if (vh != null) {
                        parent.removeAllViews();
                        parent.addView(vh.getContentView());
                        return vh;
                    }
                }
            }
            ViewHolder vh = new ViewHolder(parent, layoutId);
            parent.removeAllViews();
            parent.addView(vh.getContentView());
            return vh;
        }
        SparseArray<View> views;

        View contentView;
        int layoutId;
        private ViewHolder(ViewGroup parent, int layoutId) {
            this.views = new SparseArray<View>();
            this.layoutId = layoutId;
            this.contentView = LayoutInflater.from(parent.getContext()).inflate(
                    layoutId, parent, false);
            this.contentView.setTag(this);
        }

        public View getContentView() {
            return contentView;
        }

        public <T extends View> T getView(int viewId) {
            View view = views.get(viewId);
            if (view == null) {
                view = contentView.findViewById(viewId);
                views.put(viewId, view);
            }
            return (T) view;
        }

        public int getLayoutId() {
            return layoutId;
        }


        public void loadData(int viewId, ViewEvent viewEvent, ViewTool.LoadCallback callback) {
            createViewTool(viewId).loadData(viewEvent, callback);
        }

        public void loadData(View view, ViewEvent viewEvent, ViewTool.LoadCallback callback) {
            new ViewTool(view).loadData(viewEvent, callback);
        }


        public ViewTool createViewTool(int id) {
            return new ViewTool(getView(id));
        }

        public ViewTool createViewTool() {
            return new ViewTool(getContentView());
        }


        public void setAllEvent(ViewEvent viewEvent) {
            ViewTool.setAllEvent(getContentView(), viewEvent);
        }



    }
    public static class ViewEvent implements View.OnClickListener, View.OnLongClickListener, CompoundButton.OnCheckedChangeListener, View.OnTouchListener {

        public static final int CLICK = 0b1;
        public static final int LONG_CLICK = 0b10;
        public static final int TOUCH = 0b100;
        public static final int CHECK = 0b1000;
        int type = CLICK | LONG_CLICK | TOUCH | CHECK;
        boolean enable = true;

        public void setEnable(boolean enable) {
            this.enable = enable;
        }

        public boolean isEnable() {
            return enable;
        }

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        @Override
        public void onClick(View v) {
        }

        @Override
        public boolean onLongClick(View v) {
            return false;
        }

        @Override
        public boolean onTouch(View v, MotionEvent event) {
            return false;
        }

        @Override
        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

        }

        public void event(View view) {
            int click = type & 1;
            int longClick = (type >> 1) & 1;
            int touch = (type >> 2) & 1;
            int check = (type >> 3) & 1;
            if (click == 1)
                view.setOnClickListener(this);
            if (longClick == 1)
                view.setOnLongClickListener(this);
            if (touch == 1)
                view.setOnTouchListener(this);
            if (check == 1)
                if (view instanceof CompoundButton) {
                    ((CompoundButton) view).setOnCheckedChangeListener(this);
                }
        }

    }
    public static class ViewTool {

        public interface LoadCallback<T> {
            public void onPreLoad(ViewTool viewTool);

            public T doInBackground() throws Exception;

            public void onFailed(ViewTool viewTool);

            public void onResult(ViewTool viewTool, T o);

        }
        public static class LoadDataAsync {

            private static ExecutorService threadPool = Executors.newCachedThreadPool();
            View view;
            ViewTool viewTool;
            ViewEvent viewEvent;
            LoadCallback callback;
            Object result = null;
            public LoadDataAsync(View view, ViewEvent viewEvent, LoadCallback callback) {
                this.view = view;
                this.viewEvent = viewEvent;
                this.callback = callback;
                this.viewTool = new ViewTool(view);
            }


            public void execute() {
                callback.onPreLoad(viewTool);
                threadPool.execute(new Runnable() {
                    @Override
                    public void run() {
                        try {
                            result = callback.doInBackground();
                        } catch (Exception e) {
                        }
                        if (result == null) {
                            view.post(new Runnable() {
                                @Override
                                public void run() {
                                    callback.onFailed(viewTool);
                                }
                            });

                        } else {
                            view.post(new Runnable() {
                                @Override
                                public void run() {
                                    callback.onResult(viewTool, result);
                                }
                            });

                        }
                    }
                });
            }


        }
        public static void setAllEvent(View view, ViewEvent viewEvent) {
            new ViewTool(view).setEvent(viewEvent);
            if (view instanceof ViewGroup) {
                for (int i = 0; i < ((ViewGroup) view).getChildCount(); i++) {
                    setAllEvent(((ViewGroup) view).getChildAt(i), viewEvent);
                }
            }
        }

        public static ViewTool create(View root, int id) {
            return new ViewTool(root.findViewById(id));
        }

        public static ViewTool create(Activity activity, int id) {
            return new ViewTool(activity.findViewById(id));
        }


        private View mView;

        private ViewEvent mViewEvent;
        public ViewTool(View view) {
            this.mView = view;
        }

        public ViewTool(Activity activity) {
            this.mView = activity.getWindow().getDecorView();
        }

        public View getView() {
            return mView;
        }

        public ViewTool createViewTool(int id) {
            return new ViewTool(mView.findViewById(id));
        }

        public <T extends View> T getView(int id) {
            return (T) createViewTool(id).getView();
        }

        public CharSequence getText() {
            if (mView instanceof TextView) {
                return ((TextView) mView).getText();
            }
            return null;
        }

        public CharSequence getText(int id) {
            return createViewTool(id).getText();
        }

        public void setText(final String text) {
            if (mView instanceof TextView) {
                ((TextView) mView).setText(text);
            }
        }

        public void setText(int id, final String text) {
            createViewTool(id).setText(text);
        }


        public void setChecked(final boolean checked) {
            if (mView instanceof Checkable) {
                if (mViewEvent != null) {
                    mViewEvent.setEnable(false);
                }
                ((Checkable) mView).setChecked(checked);
                if (mViewEvent != null) {
                    mViewEvent.setEnable(true);
                }
            }
        }


        public void setChecked(int id, final boolean checked) {
            createViewTool(id).setChecked(checked);
        }

        public void setChecked(final boolean checked, ViewEvent viewEvent) {
            setChecked(checked);
        }

        public void setChecked(int id, final boolean checked, ViewEvent viewEvent) {
            createViewTool(id).setChecked(checked, viewEvent);
        }



        public void setEvent(ViewEvent event) {
            mViewEvent = event;
            event.event(mView);
        }

        public void setEvent(int id, ViewEvent event) {
            createViewTool(id).setEvent(event);
        }

        public boolean isChecked() {
            if (mView instanceof Checkable) {
                return ((Checkable) mView).isChecked();
            }
            return false;
        }

        public boolean isChecked(int id) {
            return createViewTool(id).isChecked();
        }

        public void setVisibility(int visibility) {
            mView.setVisibility(visibility);
        }

        public void setVisibility(int id, int visibility) {
            createViewTool(id).setVisibility(visibility);
        }

        public void setAllEvent(ViewEvent viewEvent) {
            setAllEvent(mView, viewEvent);
        }

        public void loadData(ViewEvent viewEvent, LoadCallback callback) {
            new LoadDataAsync(mView, viewEvent, callback).execute();
        }


    }

    List datas;
    List<DataHandler> dataHandlers;
    Context context;
    List<ViewHolder> viewHolderCaches;

    public void setDatas(List datas) {
        this.datas = datas;
    }

    public DataAdapter(Context context) {
        dataHandlers = new ArrayList<DataHandler>();
        datas = new ArrayList();
        viewHolderCaches = new ArrayList<ViewHolder>();
    }

    public void addDataHandler(DataHandler dataHandler) {
        dataHandlers.add(dataHandler);
    }

    public void addData(Object data) {
        if (!datas.contains(data))
            datas.add(data);
    }

    public void clear() {
        if (datas != null)
            datas.clear();
    }

    public void delete(int i) {
        datas.remove(i);
    }
    public void delete(Object i) {
        datas.remove(i);
    }

    @Override
    public int getCount() {
        return datas == null ? 0 : datas.size();
    }

    @Override
    public Object getItem(int position) {
        return datas.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Object data = datas.get(position);
        return getView(position, data, convertView, parent);
    }

    private DataHandler getDataHandler(int pos, Object data) {
        for (DataHandler dataHandler : dataHandlers) {
            if (dataHandler.canFillData(data) || dataHandler.canFillData(pos)) {
                return dataHandler;
            }
        }
        return null;
    }

    public ViewHolder getViewHolderCache(int layoutId) {
        for (int i = 0; i < viewHolderCaches.size(); i++) {
            ViewHolder vh = viewHolderCaches.get(i);
            if (vh.getLayoutId() == layoutId) {
                viewHolderCaches.remove(i);
                return vh;
            }
        }
        return null;
    }

    public void addViewHolderCache(ViewHolder vh) {
        viewHolderCaches.add(vh);
    }

    /**
     * 1.如果缓存中有对应数据的contentview
     *
     * @param data
     * @param convertView
     * @param parent
     * @return
     */
    private View getView(int position, Object data, View convertView,
                         ViewGroup parent) {
        LinearLayout layout = null;
        if (convertView == null) {
            layout = new LinearLayout(parent.getContext());
        } else {
            layout = (LinearLayout) convertView;
        }
        DataHandler dataHandler = getDataHandler(position, data);
        ViewHolder vh = ViewHolder.get(this, layout,
                dataHandler.getLayoutId());
        dataHandler.fillData(position, data, vh, this);
        return layout;
    }

    public <T extends Object> T getData(int pos) {

        return (T) datas.get(pos);
    }
    public List getDatas() {
        return datas;
    }

}
