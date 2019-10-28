package com.jsdroid.app.install;

import android.content.Context;
import android.view.View;
import android.view.ViewParent;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;

import com.jsdroid.app.R;
import com.jsdroid.app.adapter.DataAdapter;

import java.util.ArrayList;
import java.util.List;

public class SelectAdapter<T> extends DataAdapter {
    public SelectAdapter(Context context) {
        super(context);
        addDataRender(new SelectItemRender());
    }

    public void selectAll(boolean isChecked) {
        int count = getCount();
        for (int i = 0; i < count; i++) {
            SelectItem data = getData(i);
            data.checked = isChecked;
        }
        notifyDataSetChanged();
    }

    public class SelectItemRender extends DataAdapter.DataRender {

        @Override
        public int getLayoutId() {
            return R.layout.list_item_simple_select;
        }

        @Override
        public boolean canFillData(Object data) {
            return data instanceof SelectItem;
        }

        @Override
        public void fillData(int pos, Object data, DataAdapter.ViewHolder viewHolder, DataAdapter dataAdapter) {
            SelectItem item = (SelectItem) data;
            TextView text = viewHolder.getView(R.id.text);
            text.setText(item.item != null ? item.item.toString() : null);

            CheckBox check = viewHolder.getView(R.id.check);
            check.setOnCheckedChangeListener(null);
            check.setChecked(item.checked);
            check.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    item.checked = isChecked;
                }
            });
            ViewParent parent = check.getParent();
            if (parent instanceof View) {
                ((View) parent).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        check.performClick();
                    }
                });
            }

        }
    }

    public List<T> getSelectItems() {
        List<T> ret = new ArrayList<>();
        int count = getCount();
        for (int i = 0; i < count; i++) {
            SelectItem<T> data = getData(i);
            if (data.checked) {
                ret.add(data.item);
            }
        }
        return ret;
    }

    public static class SelectItem<T> {
        public T item;
        public boolean checked;

        public SelectItem(T item, boolean checked) {
            this.item = item;
            this.checked = checked;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            SelectItem<?> that = (SelectItem<?>) o;

            return item != null ? item.equals(that.item) : that.item == null;
        }

        @Override
        public int hashCode() {
            return item != null ? item.hashCode() : 0;
        }
    }

}
