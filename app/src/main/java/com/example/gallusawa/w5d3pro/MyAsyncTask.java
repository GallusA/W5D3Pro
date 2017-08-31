package com.example.gallusawa.w5d3pro;

import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;

/**
 * Created by Admin on 8/31/2017.
 */

public class MyAsyncTask extends AsyncTask<Object, String, String> {
    private Context c;

    @Override
    protected String doInBackground(Object... params) {
        c = (Context)params[0];

        MyApplicationSingleton.getInstance().setContext(c);


        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
        }

        return "result";
    }

    @Override
    protected void onPostExecute(String s) {
        super.onPostExecute(s);
        Intent newActivity = new Intent(c, SecondActivity.class);
        c.startActivity(newActivity);
    }
}
