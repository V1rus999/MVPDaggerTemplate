package com.droidit.mvcdaggertemplate;

import android.os.Handler;
import android.os.Looper;

import com.droidit.domain.threading.MainThread;

import javax.inject.Inject;

/**
 * Created by JohannesC on 14-Sep-16.
 * MainThread (UI Thread) implementation based on a Handler instantiated with the main
 * application Looper.
 */
public class UIThread implements MainThread {

    private final Handler handler;

    @Inject
    public UIThread() {
        this.handler = new Handler(Looper.getMainLooper());
    }

    /**
     * Causes the Runnable r to be added to the message queue.
     * The runnable will be run on the main thread.
     *
     * @param runnable {@link Runnable} to be executed.
     */
    @Override
    public void post(Runnable runnable) {
        handler.post(runnable);
    }
}
