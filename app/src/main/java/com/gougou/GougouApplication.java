package com.gougou;

import android.app.Application;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

/**
 * Created by huzhi on 16-4-7.
 */
public class GougouApplication extends Application{

    private RequestQueue mQueue;

    @Override
    public void onCreate() {
        super.onCreate();

        mQueue = Volley.newRequestQueue(this.getApplicationContext());
    }
}
