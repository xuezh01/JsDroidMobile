package com.yhao.floatwindow;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.DecelerateInterpolator;

import com.jsdroid.commons.ScreenUtil;

/**
 * Created by yhao on 2017/12/22.
 * https://github.com/yhaolpz
 */

public class IFloatWindowImpl extends IFloatWindow {


    private FloatWindow.B mB;
    private FloatView mFloatView;
    private boolean isShow;
    private boolean once = true;
    private ValueAnimator mAnimator;
    private TimeInterpolator mDecelerateInterpolator;
    private float downX;
    private float downY;
    private float upX;
    private float upY;
    private boolean mClick = false;
    private int mSlop;

    private IFloatWindowImpl() {

    }

    IFloatWindowImpl(FloatWindow.B b) {
        mB = b;
        mFloatView = new FloatPhone(b.mApplicationContext, mB.mPermissionListener);
        initTouchEvent();
        if (mB.flags != null) {
            mFloatView.setFlags(mB.flags);
        }
        mFloatView.setSize(mB.mWidth, mB.mHeight);
        mFloatView.setGravity(mB.gravity, mB.xOffset, mB.yOffset);
        mFloatView.setView(mB.mView);
    }

    @Override
    public void requestPermission() {
        mFloatView.requestPermission();
    }

    /**
     * 移动到边界，俗称靠边站
     */
    @Override
    public void toSide() {
        View v = getView();
        if (v == null) {
            return;
        }
        int startX = mFloatView.getX();
        int screenWidth = Util.getScreenWidth(mB.mApplicationContext);
        int screenHeight = Util.getScreenHeight(mB.mApplicationContext);
        int statusBarHeight = Util.getStatusBarHeight(mB.mApplicationContext);
        v.measure(screenWidth, screenHeight);
        int vWidth = v.getMeasuredWidth();
        int vHeight = v.getMeasuredHeight();
        int endX = (startX * 2 + vWidth > screenWidth) ?
                screenWidth - vWidth : 0;
        int startY = mFloatView.getY();
        final int floatY;
        if (startY > screenHeight - vHeight - statusBarHeight) {
            floatY = screenHeight - vHeight - statusBarHeight;
        } else if (startY < 0) {
            floatY = 0;
        } else {
            floatY = startY;
        }
        mFloatView.updateY(floatY);
        mAnimator = ObjectAnimator.ofInt(startX, endX);
        mAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator animation) {
                int x = (int) animation.getAnimatedValue();
                mFloatView.updateX(x);
                if (mB.mViewStateListener != null) {
                    mB.mViewStateListener.onPositionUpdate(x, floatY);
                }
            }
        });
        startAnimator();
    }

    @Override
    public void toCenterX() {
        View v = getView();
        if (v == null) {
            return;
        }
        int screenWidth = Util.getScreenWidth(mB.mApplicationContext);
        int screenHeight = Util.getScreenHeight(mB.mApplicationContext);
        v.measure(screenWidth, screenHeight);
        int vWidth = v.getMeasuredWidth();
        updateX((screenWidth - vWidth) / 2);
    }

    @Override
    public void toCenterY() {
        View v = getView();
        if (v == null) {
            return;
        }
        int screenWidth = Util.getScreenWidth(mB.mApplicationContext);
        int screenHeight = Util.getScreenHeight(mB.mApplicationContext);
        int statusBarHeight = Util.getStatusBarHeight(mB.mApplicationContext);
        v.measure(screenWidth, screenHeight);
        int vHeight = v.getMeasuredHeight();
        updateY((screenHeight - vHeight) / 2);
    }

    @Override
    public void toRight() {
        View view = getView();
        int screenWidth = Util.getScreenWidth(mB.mApplicationContext);
        int screenHeight = Util.getScreenHeight(mB.mApplicationContext);
        if (view != null) {
            view.measure(screenWidth, screenHeight);
            updateX(screenWidth - view.getMeasuredWidth());
        }
    }

    @Override
    public void toBottom() {
        View view = getView();
        int screenWidth = Util.getScreenWidth(mB.mApplicationContext);
        int screenHeight = Util.getScreenHeight(mB.mApplicationContext);
        int statusHeight = ScreenUtil.getStatusBarHeight(mB.mApplicationContext);
        if (view != null) {
            view.measure(screenWidth, screenHeight);
        }
        updateY(screenHeight - view.getMeasuredHeight() - statusHeight);
    }

    @Override
    public int getWidth() {
        View view = getView();
        int screenWidth = Util.getScreenWidth(mB.mApplicationContext);
        int screenHeight = Util.getScreenHeight(mB.mApplicationContext);
        if (view != null) {
            view.measure(screenWidth, screenHeight);
            return view.getMeasuredWidth();
        }
        return 0;
    }

    @Override
    public int getHeight() {
        View view = getView();
        int screenWidth = Util.getScreenWidth(mB.mApplicationContext);
        int screenHeight = Util.getScreenHeight(mB.mApplicationContext);
        if (view != null) {
            view.measure(screenWidth, screenHeight);
            return view.getMeasuredHeight();
        }
        return 0;
    }

    private boolean autoToSide;

    @Override
    public void setAutoToSide(boolean autoToSide) {
        this.autoToSide = autoToSide;
    }

    @Override
    public void onLayoutChanged() {
//        toSide();
        side();
    }

    @Override
    public void show() {
        if (once) {
            mFloatView.requestPermission();
            once = false;
            isShow = true;
        } else {
            if (isShow) {
                return;
            }
            getView().setVisibility(View.VISIBLE);
            isShow = true;
        }
        if (mB.mViewStateListener != null) {
            mB.mViewStateListener.onShow();
        }
    }

    @Override
    public void hide() {
        if (once || !isShow) {
            return;
        }
        getView().setVisibility(View.INVISIBLE);
        isShow = false;
        if (mB.mViewStateListener != null) {
            mB.mViewStateListener.onHide();
        }
    }

    @Override
    public boolean isShowing() {
        return isShow;
    }

    @Override
    public void setFlags(int flags) {
        mFloatView.setFlags(flags);
    }

    @Override
    void dismiss() {
        mFloatView.dismiss();
        isShow = false;
        if (mB.mViewStateListener != null) {
            mB.mViewStateListener.onDismiss();
        }
    }

    @Override
    public void updateSize(int width, int height) {
        mFloatView.setSize(width, height);
    }


    @Override
    public void updateX(int x) {
        checkMoveType();
        mB.xOffset = x;
        mFloatView.updateX(x);
    }

    @Override
    public void updateY(int y) {
        checkMoveType();
        mB.yOffset = y;
        mFloatView.updateY(y);
    }

    @Override
    public void updateX(int screenType, float ratio) {
        checkMoveType();
        mB.xOffset = (int) ((screenType == Screen.width ?
                Util.getScreenWidth(mB.mApplicationContext) :
                Util.getScreenHeight(mB.mApplicationContext)) * ratio);
        mFloatView.updateX(mB.xOffset);

    }

    @Override
    public void updateY(int screenType, float ratio) {
        checkMoveType();
        mB.yOffset = (int) ((screenType == Screen.width ?
                Util.getScreenWidth(mB.mApplicationContext) :
                Util.getScreenHeight(mB.mApplicationContext)) * ratio);
        mFloatView.updateY(mB.yOffset);

    }

    @Override
    public int getX() {
        return mFloatView.getX();
    }

    @Override
    public int getY() {
        return mFloatView.getY();
    }


    @Override
    public View getView() {
        mSlop = ViewConfiguration.get(mB.mApplicationContext).getScaledTouchSlop();
        return mB.mView;
    }


    private void checkMoveType() {
        if (mB.mMoveType == MoveType.fixed) {
            throw new IllegalArgumentException("FloatWindow of this tag is not allowed to move!");
        }
    }


    private void initTouchEvent() {
        switch (mB.mMoveType) {
            case MoveType.inactive:
                break;
            default:
                getView().setOnTouchListener(new View.OnTouchListener() {
                    float lastX, lastY, changeX, changeY;
                    int newX, newY;

                    @SuppressLint("ClickableViewAccessibility")
                    @Override
                    public boolean onTouch(View v, MotionEvent event) {

                        switch (event.getAction()) {
                            case MotionEvent.ACTION_DOWN:
                                downX = event.getRawX();
                                downY = event.getRawY();
                                lastX = event.getRawX();
                                lastY = event.getRawY();
                                cancelAnimator();
                                break;
                            case MotionEvent.ACTION_MOVE:
                                changeX = event.getRawX() - lastX;
                                changeY = event.getRawY() - lastY;
                                newX = (int) (mFloatView.getX() + changeX);
                                newY = (int) (mFloatView.getY() + changeY);
                                mFloatView.updateXY(newX, newY);
                                if (mB.mViewStateListener != null) {
                                    mB.mViewStateListener.onPositionUpdate(newX, newY);
                                }
                                lastX = event.getRawX();
                                lastY = event.getRawY();
                                side();
                                break;
                            case MotionEvent.ACTION_UP:
                                upX = event.getRawX();
                                upY = event.getRawY();
                                mClick = (Math.abs(upX - downX) > mSlop) || (Math.abs(upY - downY) > mSlop);
                                //边界检测
                                if (autoToSide) {
                                    toSide();
                                }

                                break;
                            default:
                                break;
                        }
                        return mClick;
                    }
                });
        }
    }

    private void side() {
        int screenWidth = Util.getScreenWidth(mB.mApplicationContext);
        int screenHeight = Util.getScreenHeight(mB.mApplicationContext);
        int statusBarHeight = Util.getStatusBarHeight(mB.mApplicationContext);
        int startX = mFloatView.getX();
        int startY = mFloatView.getY();
        if (startX < 0) {
            updateX(0);
        } else if (startX > screenWidth - getWidth()) {
            updateX(screenWidth - getWidth());
        }
        if (startY < 0) {
            updateY(0);
        } else if (startY > screenHeight - statusBarHeight - getHeight()) {
            updateY(screenHeight - getHeight() - statusBarHeight);
        }
    }

    private void startAnimator() {
        if (mB.mInterpolator == null) {
            if (mDecelerateInterpolator == null) {
                mDecelerateInterpolator = new DecelerateInterpolator();
            }
            mB.mInterpolator = mDecelerateInterpolator;
        }
        mAnimator.setInterpolator(mB.mInterpolator);
        mAnimator.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animation) {
                mAnimator.removeAllUpdateListeners();
                mAnimator.removeAllListeners();
                mAnimator = null;
                if (mB.mViewStateListener != null) {
                    mB.mViewStateListener.onMoveAnimEnd();
                }
            }
        });
        mAnimator.setDuration(mB.mDuration).start();
        if (mB.mViewStateListener != null) {
            mB.mViewStateListener.onMoveAnimStart();
        }
    }

    private void cancelAnimator() {
        if (mAnimator != null && mAnimator.isRunning()) {
            mAnimator.cancel();
        }
    }

}
