package com.example.my_app;

import com.google.firebase.messaging.FirebaseMessagingService;
import io.repro.android.Repro;

public class MyFirebaseMessagingService extends FirebaseMessagingService {
    @Override
    public void onNewToken(String token) {
        Repro.setPushRegistrationID(token);
    }
}