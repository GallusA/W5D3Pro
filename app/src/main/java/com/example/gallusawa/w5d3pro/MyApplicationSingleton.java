package com.example.gallusawa.w5d3pro;

import android.content.Context;

/**
 * Created by Admin on 8/31/2017.
 */

public class MyApplicationSingleton {

    private Context c;
    private static MyApplicationSingleton instance;

    public Context getContext() {
        return c;
    }

    public void setContext(Context context) {
        this.c = context;
    }

    public static MyApplicationSingleton getInstance() {
        if (instance == null) {
            instance = new MyApplicationSingleton();
        }
        return instance;
    }
}
