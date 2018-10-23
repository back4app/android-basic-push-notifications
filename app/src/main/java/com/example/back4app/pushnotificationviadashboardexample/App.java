package com.example.back4app.pushnotificationviadashboardexample;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseInstallation;

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId(getString(R.string.back4app_app_id))
                .clientKey(getString(R.string.back4app_client_key))
                .server(getString(R.string.back4app_server_url))
                .enableLocalDataStore()
                .build());


        ParseInstallation installation = ParseInstallation.getCurrentInstallation();
        installation.put("GCMSenderId", getString(R.string.gcm_sender_id));
        installation.saveInBackground();

    }
}