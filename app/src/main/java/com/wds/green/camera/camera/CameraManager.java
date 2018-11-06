package com.wds.green.camera.camera;

import android.content.Context;
import android.view.View;

public class CameraManager {
    private static final String TAG = CameraManager.class.getSimpleName();
    private final  Context       context;
    private final  View          view;

    private CameraManager(Context context, View view) {
        this.context = context;
        this.view = view;
    }
    private static CameraManager instance;
    public static CameraManager getInstance(Context context, View view){
        if (instance == null) {
                synchronized (CameraManager.class) {
                    if (instance == null) {
                        instance = new CameraManager(context,view);
                    }
                }
            }
            return instance;
    }

}
