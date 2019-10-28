package com.jsdroid.app.design.tree;

import android.content.Context;
import android.widget.TextView;

import com.jsdroid.app.R;
import com.jsdroid.app.adapter.DataAdapter;
import com.jsdroid.groovy.antlr4.parser.util.ParserUtil;

import java.util.Arrays;

public class DesignMenuAdapter extends DataAdapter {
    class DesignMenuRender extends DataAdapter.DataRender {

        @Override
        public int getLayoutId() {
            return R.layout.list_item_design_menu;
        }

        @Override
        public boolean canFillData(Object data) {
            return data instanceof String;
        }

        @Override
        public void fillData(int pos, Object data, DataAdapter.ViewHolder viewHolder, DataAdapter dataAdapter) {
            TextView view = viewHolder.getView(R.id.text);
            view.setText(data.toString());
        }
    }


    public DesignMenuAdapter(Context context, String[] menu) {
        super(context);

        addDataRender(new DesignMenuRender());
        setDatas(Arrays.asList(menu));
    }


}
