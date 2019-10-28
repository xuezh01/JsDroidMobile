package com.jsdroid.uiautomator2;

import android.accessibilityservice.AccessibilityService;
import android.graphics.Region;
import android.os.IBinder;
import android.view.KeyEvent;
import android.view.accessibility.AccessibilityEvent;

public class CallbacksProxy implements AccessibilityService.Callbacks {
    private AccessibilityService.Callbacks origin;

    public CallbacksProxy(AccessibilityService.Callbacks origin) {
        this.origin = origin;
    }

    @Override
    public void onAccessibilityEvent(AccessibilityEvent event) {
        origin.onAccessibilityEvent(event);
    }

    @Override
    public void onInterrupt() {
        origin.onInterrupt();
    }

    @Override
    public void onServiceConnected() {
        origin.onServiceConnected();
    }

    @Override
    public void init(int connectionId, IBinder windowToken) {
        origin.init(connectionId, windowToken);
    }

    @Override
    public boolean onGesture(int gestureId) {
        return origin.onGesture(gestureId);
    }

    @Override
    public boolean onKeyEvent(KeyEvent event) {
        return origin.onKeyEvent(event);
    }

    @Override
    public void onMagnificationChanged(Region region, float scale, float centerX, float centerY) {
        origin.onMagnificationChanged(region, scale, centerX, centerY);
    }

    @Override
    public void onSoftKeyboardShowModeChanged(int showMode) {
        origin.onSoftKeyboardShowModeChanged(showMode);
    }

    @Override
    public void onPerformGestureResult(int sequence, boolean completedSuccessfully) {
        origin.onPerformGestureResult(sequence, completedSuccessfully);
    }

    @Override
    public void onFingerprintCapturingGesturesChanged(boolean active) {
        origin.onFingerprintCapturingGesturesChanged(active);
    }

    @Override
    public void onFingerprintGesture(int gesture) {
        origin.onFingerprintGesture(gesture);
    }

    @Override
    public void onAccessibilityButtonClicked() {
        origin.onAccessibilityButtonClicked();
    }

    @Override
    public void onAccessibilityButtonAvailabilityChanged(boolean available) {
        origin.onAccessibilityButtonAvailabilityChanged(available);
    }
}
