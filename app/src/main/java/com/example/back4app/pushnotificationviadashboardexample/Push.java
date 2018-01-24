package com.example.back4app.pushnotificationviadashboardexample;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseInstallation;

public class Push extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Parse.initialize(this);
        ParseInstallation installation = ParseInstallation.getCurrentInstallation();
        // don't forget to change the line below with the sender ID you obtained at Firebase
        installation.put("GCMSenderId", "PASTE_YOUR_SENDER_ID");
        installation.saveInBackground();

    }
}