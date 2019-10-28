package com.jsdroid.thread;

import android.os.SystemClock;
import android.util.Log;

import java.util.HashMap;
import java.util.Map;

/**
 * 用于多线程处理一个多步骤任务。
 * <p>
 * 使用场景：远程投屏分为3步：截图、压缩、发送，如果全部在一个线程完成，那么效率会很低，而每个步骤一个线程，就能节约一半以上时间。
 * <p>
 * 使用：StepThread step = StepThread.getInstance(new Function()).next(new Function()).onEnd(new End())
 * step.post(data)
 * step.loop(data,100)
 * <p>
 * 结束所有步骤线程：step.quit()
 *
 * @param <From>
 * @param <To>
 */
public class StepThread<From, To> extends Thread {
    private static Map<String, Object> properties = new HashMap<>();

    public static void setProperty(String key, Object value) {
        properties.put(key, value);
    }

    public static <T> T getProperty(String key, T defaultValue) {
        if (properties.containsKey(key)) {
            return (T) properties.get(key);
        }
        return defaultValue;
    }

    private StepThread first;
    private StepThread next;
    //循环延时
    private long loopDelay;
    private long lastLoopTime;
    private From data;
    private Function<From, To> function;
    private End<To> end;

    public StepThread(Function<From, To> function) {
        this.function = function;
        start();
    }

    public Object getIn() {
        return first.data;
    }

    private void setNext(StepThread next) {
        this.next = next;
    }

    private void setFirst(StepThread first) {
        this.first = first;
    }


    private void setData(From data) {
        this.data = data;
        synchronized (this) {
            this.notify();
        }
    }

    private void fireError(Throwable err) {
        if (end != null) {
            end.onError(this, err);
            synchronized (end) {
                end.notify();
            }
        } else {
            if (next != null) {
                next.fireError(err);
            }
        }
    }

    private void fireEnd() {
        if (end != null) {
            end.onEnd(this, null);
            synchronized (end) {
                end.notify();
            }
        } else {
            if (next != null) {
                next.fireEnd();
            }
        }
    }


    @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted()) {
            if (loopDelay != 0) {
                long time = System.currentTimeMillis();
                long useTime = time - lastLoopTime;
                lastLoopTime = time;
                long wait = loopDelay - useTime;
                if (wait > 0) {
                    try {
                        Thread.sleep(wait);
                    } catch (InterruptedException e) {
                    }
                }
            } else {
                synchronized (this) {
                    try {
                        this.wait();
                    } catch (InterruptedException e) {
                    }
                }
            }
            try {
                To result = function.apply(data);
                if (result != null) {
                    if (end != null) {
                        end.onEnd(this, result);
                        synchronized (end) {
                            end.notify();
                        }
                    } else if (next != null) {
                        next.setData(result);
                    }
                } else {
                    fireEnd();
                }
            } catch (Throwable e) {
                fireError(e);
            }
        }
    }


    public <Next> StepThread<To, Next> next(Function<To, Next> function) {
        StepThread<To, Next> next = new StepThread<>(function);
        setNext(next);
        next.setFirst(first);
        return next;
    }

    public StepThread end(End<To> end) {
        this.end = end;
        return this;
    }

    public void loop(Object data, long delay) {
        first.loopDelay = delay;
        post(data);
    }

    public void loop(long delay) {
        first.loopDelay = delay;
        post(first.data);
    }

    public void stopLoop() {
        first.loopDelay = 0;
    }

    public StepThread post(Object data) {
        first.setData(data);
        return this;
    }

    public StepThread postAndWaitEnd(Object data) {
        first.setData(data);
        if (end == null) {
            throw new NullPointerException("请添加一个end线程:onEnd(new Function())");
        }
        synchronized (end) {
            try {
                end.wait();
            } catch (InterruptedException e) {
            }
        }
        return this;
    }

    public void quit() {
        StepThread step = first;
        while (step != null) {
            step.interrupt();
            step = step.next;
        }
    }

    public static <From, To> StepThread<From, To> create(Function<From, To> function) {
        StepThread<From, To> fromToStepThread = new StepThread<>(function);
        fromToStepThread.setFirst(fromToStepThread);
        return fromToStepThread;
    }
}
