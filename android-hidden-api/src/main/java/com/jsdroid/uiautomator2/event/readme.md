## api 26
```java
class AccessibilityService{
    class IAccessibilityServiceClientWrapper{
        private final Callbacks mCallback;
    }
    public interface Callbacks {
        void onAccessibilityEvent(AccessibilityEvent event);
        void onInterrupt();
        void onServiceConnected();
        void init(int connectionId, IBinder windowToken);
        boolean onGesture(int gestureId);
        boolean onKeyEvent(KeyEvent event);
        void onMagnificationChanged(@NonNull Region region,
                float scale, float centerX, float centerY);
        void onSoftKeyboardShowModeChanged(int showMode);
        void onPerformGestureResult(int sequence, boolean completedSuccessfully);
        void onFingerprintCapturingGesturesChanged(boolean active);
        void onFingerprintGesture(int gesture);
        void onAccessibilityButtonClicked();
        void onAccessibilityButtonAvailabilityChanged(boolean available);
    }
}
class UiAutomation{
     IAccessibilityServiceClient mClient
        = new IAccessibilityServiceClientImpl(looper);
     
}
                
``` 
      
## api25
```java
class AccessibilityService{
    class IAccessibilityServiceClientWrapper{
        private final Callbacks mCallback;
    }
   public interface Callbacks {
          public void onAccessibilityEvent(AccessibilityEvent event);
          public void onInterrupt();
          public void onServiceConnected();
          public void init(int connectionId, IBinder windowToken);
          public boolean onGesture(int gestureId);
          public boolean onKeyEvent(KeyEvent event);
          public void onMagnificationChanged(@NonNull Region region,
                  float scale, float centerX, float centerY);
          public void onSoftKeyboardShowModeChanged(int showMode);
          public void onPerformGestureResult(int sequence, boolean completedSuccessfully);
      }
}
```

## api24
```java
class AccessibilityService{
    class IAccessibilityServiceClientWrapper{
        private final Callbacks mCallback;
    }
    public interface Callbacks {
          public void onAccessibilityEvent(AccessibilityEvent event);
          public void onInterrupt();
          public void onServiceConnected();
          public void init(int connectionId, IBinder windowToken);
          public boolean onGesture(int gestureId);
          public boolean onKeyEvent(KeyEvent event);
          public void onMagnificationChanged(@NonNull Region region,
                  float scale, float centerX, float centerY);
          public void onSoftKeyboardShowModeChanged(int showMode);
          public void onPerformGestureResult(int sequence, boolean completedSuccessfully);
      }
}
 
```
## api23
```java
class AccessibilityService{
    class IAccessibilityServiceClientWrapper{
        private final Callbacks mCallback;
    }
    public interface Callbacks {
        public void onAccessibilityEvent(AccessibilityEvent event);
        public void onInterrupt();
        public void onServiceConnected();
        public void init(int connectionId, IBinder windowToken);
        public boolean onGesture(int gestureId);
        public boolean onKeyEvent(KeyEvent event);
    }
}
```
## api22
```java
class AccessibilityService{
    class IAccessibilityServiceClientWrapper{
        private final Callbacks mCallback;
    }
    public interface Callbacks {
        public void onAccessibilityEvent(AccessibilityEvent event);
        public void onInterrupt();
        public void onServiceConnected();
        public void init(int connectionId, IBinder windowToken);
        public boolean onGesture(int gestureId);
        public boolean onKeyEvent(KeyEvent event);
    }
}
```

## api21
```java
class AccessibilityService{
    class IAccessibilityServiceClientWrapper{
        private final Callbacks mCallback;
    }
    public interface Callbacks {
        public void onAccessibilityEvent(AccessibilityEvent event);
        public void onInterrupt();
        public void onServiceConnected();
        public void onSetConnectionId(int connectionId);
        public boolean onGesture(int gestureId);
        public boolean onKeyEvent(KeyEvent event);
    }
}

```

## api 20
```java
class AccessibilityService{
    class IAccessibilityServiceClientWrapper{
        private final Callbacks mCallback;
    }
    public interface Callbacks {
        public void onAccessibilityEvent(AccessibilityEvent event);
        public void onInterrupt();
        public void onServiceConnected();
        public void onSetConnectionId(int connectionId);
        public boolean onGesture(int gestureId);
        public boolean onKeyEvent(KeyEvent event);
    }
}
```


## api 19
```java
class AccessibilityService{
    class IAccessibilityServiceClientWrapper{
        private final Callbacks mCallback;
    }
    public interface Callbacks {
        public void onAccessibilityEvent(AccessibilityEvent event);
        public void onInterrupt();
        public void onServiceConnected();
        public void onSetConnectionId(int connectionId);
        public boolean onGesture(int gestureId);
        public boolean onKeyEvent(KeyEvent event);
    }
}
```
## api 18
```java
class AccessibilityService{
    class IAccessibilityServiceClientWrapper{
        private final Callbacks mCallback;
    }
    public interface Callbacks {
        public void onAccessibilityEvent(AccessibilityEvent event);
        public void onInterrupt();
        public void onServiceConnected();
        public void onSetConnectionId(int connectionId);
        public boolean onGesture(int gestureId);
        public boolean onKeyEvent(KeyEvent event);
    }
}
```
