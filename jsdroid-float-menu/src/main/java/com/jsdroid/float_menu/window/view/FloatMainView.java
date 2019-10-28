package com.jsdroid.float_menu.window.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Build;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.jsdroid.float_menu.R;
import com.jsdroid.float_menu.ScreenUtils;
import com.jsdroid.float_menu.window.FloatMenuManager;

/**
 * 主悬浮窗
 *
 * @author toeii
 * @version 1.0.0.0
 * @date 2016/9/6
 * @path https://github.com/toeii/FloatWindow
 */
public class FloatMainView extends LinearLayout implements SensorEventListener {

    private int TIME = 3000;// 3秒后开始贴边
    private int LONG_TIME = 10000;// 10秒后开始贴边
    private final int MOVE_DISTANCE = 20;// 移动距离

    private final int LEFT = 1;
    private final int RIGHT = 2;
    // 子窗口显示位置
    private int position = LEFT;

    private Context mContext;

    // 翻转角度
    private final int FLIP_ANGLE_DOWN = -9;
    private final int FLIP_ANGLE_UP = 9;
    // 感应器管理器
    private SensorManager mSensorManager = null;
    private Sensor mAccelerometer = null;
    private FloatMenuManager mFloatMenuManager;
    private WindowManager mWindowManager;
    private FloatMenuView mFloatMenuView;// 菜单窗
    private WindowManager.LayoutParams mWindowParams;
    private WindowManager.LayoutParams mMenuViewWindowParams;

    private ImageView mSuspendIv;
    private static Handler handler = new Handler();// 透明化定时
//	private TranslateAnimation mClingAnimation;// 悬浮窗贴边动画

    // 屏幕宽高
    private int mScreenWidth;
    private int mScreenHeigh;

    // 窗体宽高
    public int mWindowWidth;
    public int mWindowHeight;

    // 当前移动X轴,Y轴
    private float mNowX;
    private float mNowY;

    // 之前位置X轴,Y轴
    private float mTouchStartX;
    private float mTouchStartY;

    private boolean isMove = false;//是否正在移动
    private boolean isCling = false;// 是否贴边
    private boolean isMoveComeHide = false;// 是否移动在隐藏窗口上
    private boolean isTurnOver = false;// 手机翻转是否停止
    private boolean isAddedMenu = false;// 是否有显示菜单栏窗口

    public void setWindowParams(WindowManager.LayoutParams mWindowParams) {
        this.mWindowParams = mWindowParams;
    }

    public FloatMainView(Context context) {
        super(context);
        this.mContext = context;
        mSensorManager = (SensorManager) mContext.getSystemService(mContext.SENSOR_SERVICE);
        mAccelerometer = mSensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);
        mFloatMenuManager = FloatMenuManager.getInstance(mContext);
        mWindowManager = mFloatMenuManager.getWindowManager();
        mFloatMenuView = mFloatMenuManager.getFloatMenuView();
        mMenuViewWindowParams = mFloatMenuManager.getLayoutParams(mFloatMenuManager.VIEW_MENU);
        LayoutInflater.from(mContext).inflate(R.layout.float_main_view, this);
        View view = findViewById(R.id.layout);
        mWindowWidth = view.getLayoutParams().width;
        mWindowHeight = view.getLayoutParams().height;
        mSuspendIv = (ImageView) findViewById(R.id.iv_suspend);
        mSuspendIv.setVisibility(View.VISIBLE);

        setAlpha();

        measure();

        //贴边
        handler.postDelayed(clingBoundaryRunnable, TIME);


    }


    private void measure() {
        mScreenWidth = ScreenUtils.getScreenWidth(getContext());
        mScreenHeigh = ScreenUtils.getScreenHeight(getContext());
        if (null == mFloatMenuManager.getFloatMainView()) {
            return;
        }
        if (mWindowParams.y > mScreenHeigh - ScreenUtils.dip2px(mContext, 48)) {
            mWindowParams.y = mScreenHeigh - ScreenUtils.dip2px(mContext, 48);
            updateViewLayout(mFloatMenuManager.getFloatMainView(), mWindowParams);
            timerAgain();
            mFloatMenuManager.getFloatMenuView().setVisibility(GONE);
        }

    }

    @Override
    protected void onLayout(boolean changed, int l, int t, int r, int b) {
        super.onLayout(changed, l, t, r, b);
        measure();
//        mFloatMenuManager.getFloatWindowMenuView().setVisibility(GONE);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        mNowX = event.getRawX();
        mNowY = event.getRawY() - ScreenUtils.getStatusHeight(mContext);
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                handler.removeCallbacks(clingBoundaryRunnable);
                handler.removeCallbacks(transparentRunnable);
                isMove = false;
                mTouchStartX = event.getX();
                mTouchStartY = event.getY();
                setAlpha();
                break;
            case MotionEvent.ACTION_MOVE:
                if (mTouchStartY - event.getY() > MOVE_DISTANCE
                        || mTouchStartY - event.getY() < -MOVE_DISTANCE
                        || mTouchStartX - event.getX() > MOVE_DISTANCE
                        || mTouchStartX - event.getX() < -MOVE_DISTANCE) {
                    isMove = true;
                    if (isAddedMenu) {
                        isAddedMenu = false;
                        // 隐藏菜单
                        mFloatMenuView.setVisibility(View.GONE);
                    }
                    updateViewPosition();


                }

                break;
            case MotionEvent.ACTION_UP:
                if (isMoveComeHide) {
                    mFloatMenuManager.removeMainWindow();
                } else {
                    judgeScreenEdge();
                    if (mTouchStartY - event.getY() > MOVE_DISTANCE
                            || mTouchStartY - event.getY() < -MOVE_DISTANCE
                            || mTouchStartX - event.getX() > MOVE_DISTANCE
                            || mTouchStartX - event.getX() < -MOVE_DISTANCE) {
                        mTouchStartX = mTouchStartY = 0;
                    } else {
                        if (isAddedMenu) {
                            isAddedMenu = false;
                            mFloatMenuView.setVisibility(View.GONE);
                        } else if (!isMove && !isCling) {
                            int paddingLeft;
                            int paddingRight;
                            int paddingTop = mFloatMenuView.getPaddingTop();
                            int paddingBottom = mFloatMenuView.getPaddingBottom();
                            int padding = ScreenUtils.dip2px(mContext, 16);
                            if (position == LEFT) {
                                paddingLeft = padding;
                                paddingRight = padding / 2;
                                mFloatMenuView.setPadding(paddingLeft, paddingTop, paddingRight, paddingBottom);
                            } else {
                                paddingLeft = padding / 2;
                                paddingRight = padding;
                                mFloatMenuView.setPadding(paddingLeft, paddingTop, paddingRight, paddingBottom);
                            }

                            mFloatMenuView.measure(0, 0);
                            int measuredWidth = mFloatMenuView.getMeasuredWidth();
                            int measuredHeight = mFloatMenuView.getMeasuredHeight();
                            int height = getHeight();

                            mMenuViewWindowParams.y = mWindowParams.y + (height - measuredHeight) / 2;
                            mFloatMenuView.setVisibility(View.VISIBLE);

                            if (position == LEFT) {
                                mMenuViewWindowParams.x = mWindowParams.x + mSuspendIv.getWidth() + ScreenUtils.dip2px(mContext, 8);
                                mFloatMenuView.setBackgroundResource(R.drawable.dialog_arrow_left);
                            } else {
                                mMenuViewWindowParams.x = mWindowParams.x - measuredWidth - ScreenUtils.dip2px(mContext, 8);
                                mFloatMenuView.setBackgroundResource(R.drawable.dialog_arrow_right);
                            }


                            updateViewLayout(mFloatMenuView, mMenuViewWindowParams);
                            isAddedMenu = true;
                        }
                    }
                    suspendMoveEnd();
                }
                isCling = false;
                break;
        }
        return true;
    }

    // 更新浮动窗口位置参数
    private void updateViewPosition() {
        mWindowParams.x = (int) (mNowX - mTouchStartX);
        mWindowParams.y = (int) (mNowY - mTouchStartY);
        // 限制悬浮滑动范围
        viewMoveRestrict();
        updateViewLayout(mFloatMenuManager.getFloatMainView(), mWindowParams);
    }

    private void updateViewLayout(View view, WindowManager.LayoutParams mWindowParams) {
        if (null == view || null == mWindowParams) {
            return;
        }
        mFloatMenuManager.setWindowParams(mWindowParams);
        try {
            mWindowManager.updateViewLayout(view, mWindowParams);
        } catch (Exception e) {
            mWindowManager.addView(view, mWindowParams);
            mWindowManager.updateViewLayout(view, mWindowParams);
        }
    }

    private void viewMoveRestrict() {
        if (mWindowParams.x > mScreenWidth - ScreenUtils.dip2px(mContext, 48)) {
            mWindowParams.x = mScreenWidth - ScreenUtils.dip2px(mContext, 48);
        } else if (mWindowParams.x <= 0) {
            mWindowParams.x = 0;
        }
        if (mWindowParams.y > mScreenHeigh - ScreenUtils.dip2px(mContext, 48)) {
            mWindowParams.y = mScreenHeigh - (ScreenUtils.dip2px(mContext, 48));//这里没有减状态栏高度。某些应用接入时是隐藏状态栏的,感觉所需要的情况去修改吧
        } else if (mWindowParams.y <= 0) {
            mWindowParams.y = 0;
        }
    }

    // 移动结束后的定位
    public void suspendMoveEnd() {
        if (null == mFloatMenuManager.getFloatMainView()) {
            return;
        }
//		if (AppUtil.isScreenChange(mContext)) {
//			if (mScreenHeigh / 2 > mWindowParams.x) {
//				mWindowParams.x = 0;
//			} else {
//				mWindowParams.x = mScreenHeigh - mSuspendIv.getWidth();
//			}
//		} else {
        if (mScreenWidth / 2 > mWindowParams.x) {
            mWindowParams.x = 0;
        } else {
            mWindowParams.x = mScreenWidth - ScreenUtils.dip2px(mContext, 48);
        }
//		}
        if (mWindowParams.y > mScreenHeigh - ScreenUtils.dip2px(mContext, 48)) {
            mWindowParams.y = mScreenHeigh - ScreenUtils.dip2px(mContext, 48);
        }

        updateViewLayout(mFloatMenuManager.getFloatMainView(), mWindowParams);
        timerAgain();
    }

    // 透明化定时
    private void timerAgain() {
        if (null == mFloatMenuManager.getFloatMainView()) {
            return;
        }
        if (null != handler) {
            handler.removeCallbacks(clingBoundaryRunnable);
            if (isAddedMenu) {
                handler.postDelayed(clingBoundaryRunnable, LONG_TIME);
            } else {
                handler.postDelayed(clingBoundaryRunnable, TIME);
            }
        }
    }

    // 还原透明度
    private void setAlpha() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
            mSuspendIv.setImageAlpha(204);
        } else {
            mSuspendIv.setAlpha(204);
        }
    }

    // 悬浮窗贴边线程
    protected Runnable clingBoundaryRunnable = new Runnable() {
        @Override
        public void run() {
            suspendClingBoundary();

            // 两秒后透明
            handler.postDelayed(transparentRunnable, 2000);

            // 菜单栏
            if (isAddedMenu) {
                isAddedMenu = false;
                mFloatMenuView.setVisibility(View.GONE);
            }
        }
    };

    // 贴边后的半透明处理
    protected Runnable transparentRunnable = new Runnable() {
        @Override
        public void run() {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
                mSuspendIv.setImageAlpha(128);
            } else {
                mSuspendIv.setAlpha(128);
            }
        }
    };

    // 判断屏幕两边
    private void judgeScreenEdge() {
        if (mScreenWidth / 2 > mWindowParams.x) {
            position = LEFT;
        } else {
            position = RIGHT;
        }
    }

    // 贴边
    private void suspendClingBoundary() {
        if (mWindowParams.x == 0) {
            mWindowParams.x = ScreenUtils.dip2px(mContext, -24);
        } else {
//			if (AppUtil.isScreenChange(mContext)) {
//				mWindowParams.x = mScreenHeigh - AppUtil.dip2px(mContext, 24);
//			} else {
            mWindowParams.x = mScreenWidth - ScreenUtils.dip2px(mContext, 24);
//			}
        }
        updateViewLayout(mFloatMenuManager.getFloatMainView(), mWindowParams);
        isCling = true;
    }


    @Override
    public void onSensorChanged(SensorEvent event) {
        float value = event.values[2];
        // -10 ~ 10 水平翻转值
        if (value < FLIP_ANGLE_DOWN) {
            isTurnOver = true;
        }

        if (isTurnOver && value > FLIP_ANGLE_UP) {
            if (!mFloatMenuManager.isShowing()) {
                mFloatMenuManager.createMainWindow(mContext);
                // 恢复默认坐标
//				updateViewLayout(mFloatMenuManager.getFloatWindowMainView(),mWindowParams);
                isTurnOver = false;
                suspendMoveEnd();
            } else {
                mFloatMenuManager.removeMainWindow();
                isTurnOver = false;
            }
        }
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy) {

    }

    public void registerSensorEventListener() {
        if (null != mSensorManager) {
            mSensorManager.registerListener(this, mAccelerometer, SensorManager.SENSOR_DELAY_UI);
        }
    }

    public void unregisterSensorEventListener() {
        if (null != mSensorManager) {
            mSensorManager.unregisterListener(this);
        }
    }

    public void setAddedMenu(boolean addedMenu) {
        isAddedMenu = addedMenu;
    }

    public void setLogo(Drawable logo) {
        mSuspendIv.setImageDrawable(logo);
    }
}
