package com.example.my_app;

import android.util.Log;

import io.flutter.app.FlutterApplication;
import io.repro.android.Repro;

public class MyApplication extends FlutterApplication {

    @Override
    public void onCreate() {
        super.onCreate();
        Repro.setup(this, "");
        Log.d("Info", "onCreate!");
        Repro.enablePushNotification();
    }
}
