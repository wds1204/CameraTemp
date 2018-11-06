package com.wds.green.camera;

import android.app.Application;
import android.content.Context;

import com.wds.green.camera.utils.SharedPreferenceUtil;

public class App  extends Application{
    public static Context mApplication;
    @Override
    public void onCreate() {
        super.onCreate();
        mApplication=getApplicationContext();
        SharedPreferenceUtil.getInstance().init(getApplicationContext());
    }
}
