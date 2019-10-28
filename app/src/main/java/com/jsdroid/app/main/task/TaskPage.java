package com.jsdroid.app.main.task;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.ditclear.swipelayout.SwipeDragLayout;
import com.jsdroid.app.R;
import com.jsdroid.app.adapter.DataAdapter;
import com.jsdroid.app.entity.Plan;
import com.jsdroid.app.entity.Tool;
import com.jsdroid.app.jsd.JsdPlan;
import com.jsdroid.app.jsd.JsdTool;
import com.jsdroid.app.pager.Page;
import com.jsdroid.app.utils.Dialogs;
import com.jsdroid.app.view.BasePropView;
import com.jsdroid.app.view.FullSwipeDragLayout;
import com.jsdroid.mvp.view.BaseView;
import com.qmuiteam.qmui.widget.dialog.QMUIDialog;
import com.qmuiteam.qmui.widget.dialog.QMUIDialogAction;

import java.text.SimpleDateFormat;
import java.util.List;

import butterknife.BindView;

public class TaskPage extends Page<TaskPage, TaskPresenter> {

    @BindView(R.id.listView)
    ListView listView;
    DataAdapter dataAdapter;
    @BindView(R.id.btnAdd)
    android.support.design.widget.FloatingActionButton btnAdd;

    public TaskPage(Context context) {
        super(context);
    }

    @Override
    protected TaskPresenter createPresenter() {
        return new TaskPresenter();
    }

    @Override
    protected int getLayoutId() {
        return R.layout.main_task_page;
    }

    @Override
    protected void initAdapters() {
        super.initAdapters();
        dataAdapter = new DataAdapter(getContext());
        dataAdapter.addDataRender(new PlanRender());
        listView.setAdapter(dataAdapter);
    }

    @Override
    protected void bindEvents() {
        super.bindEvents();
        btnAdd.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                AddTaskActivity.open(getContext());
            }
        });
        listView.setOnLongClickListener(new OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                return false;
            }

        });
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            }
        });
        listView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                Plan data = dataAdapter.getData(position);
                Dialogs.showDialog(getContext(), "提示", "确定删除任务" + Plan.PlanType.valueOf(data.getPlanType()).text() + "?",
                        Dialogs.newAction(getContext(), "取消", new QMUIDialogAction.ActionListener() {
                            @Override
                            public void onClick(QMUIDialog dialog, int index) {
                                dialog.dismiss();
                            }
                        }),
                        Dialogs.newAction(getContext(), "删除", new QMUIDialogAction.ActionListener() {
                            @Override
                            public void onClick(QMUIDialog dialog, int index) {
                                dialog.dismiss();
                                JsdPlan.getInstance().delete(data);
                            }
                        })
                );
                return true;
            }
        });
    }

    public void showPlans(List<Plan> list) {
        dataAdapter.setDatas(list);
        dataAdapter.notifyDataSetChanged();
    }


    class PlanRender extends DataAdapter.DataRender {
        @Override
        public int getLayoutId() {
            return R.layout.list_item_plan;
        }

        @Override
        public boolean canFillData(Object data) {
            return data instanceof Plan;
        }

        @Override
        public void fillData(int pos, Object data, DataAdapter.ViewHolder viewHolder, DataAdapter dataAdapter) {
            Plan plan = (Plan) data;
            ImageView propIcon = viewHolder.getView(R.id.propIcon);
            TextView time = viewHolder.getView(R.id.time);
            BasePropView propType = viewHolder.getView(R.id.propType);
            BasePropView propCycle = viewHolder.getView(R.id.propCycle);
            BasePropView propTime = viewHolder.getView(R.id.propTime);
            BasePropView propTool = viewHolder.getView(R.id.propTool);
            long runTime = plan.runDate.getTime();
            long count = runTime - System.currentTimeMillis();
            if (count > 24 * 60 * 60 * 1000L) {
                time.setText(count / (24 * 60 * 60 * 1000L) + "天");
            } else if (count > 60 * 60 * 1000L) {
                time.setText(count / (60 * 60 * 1000L) + "时");
            } else if (count > 60 * 1000L) {
                time.setText(count / (60 * 1000L) + "分");
            } else if (count > 1000L) {
                time.setText(count / 1000L + "秒");
            } else {
                time.setText("");
            }
            Tool tool = JsdTool.getInstance().getByPkg(plan.content);
            if (tool != null) {
                propIcon.setImageBitmap(BitmapFactory.decodeFile(tool.icon));
                propTool.setProperty(tool.getName());
            } else {
                propIcon.setImageResource(R.drawable.task);
                propTool.setProperty("无");
            }
            propType.setProperty(Plan.PlanType.valueOf(plan.planType).text());
            propTime.setProperty(new SimpleDateFormat().format(plan.runDate));
            propCycle.setProperty(plan.cycleText);


        }
    }
}
