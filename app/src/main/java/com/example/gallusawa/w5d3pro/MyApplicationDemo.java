package com.example.gallusawa.w5d3pro;

import android.app.Application;
import android.content.Context;
import android.os.StrictMode;

import com.squareup.leakcanary.LeakCanary;
import com.squareup.leakcanary.RefWatcher;

/**
 * Created by Admin on 8/31/2017.
 */

public class MyApplicationDemo extends Application {

    private RefWatcher ref;

    public static RefWatcher getRefWatcher(Context context) {
        MyApplicationDemo application = (MyApplicationDemo) context.getApplicationContext();
        return application.ref;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        setupLeakCanary();
        ref = LeakCanary.install(this);
    }
    protected void setupLeakCanary() {
        if (LeakCanary.isInAnalyzerProcess(this)) {

            return;
        }
        enabledStrictMode();
        LeakCanary.install(this);
    }
    private static void enabledStrictMode() {
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder()//
                .detectAll()//
                .penaltyLog()//
                .penaltyDeath()//
                .build());
    }

}
