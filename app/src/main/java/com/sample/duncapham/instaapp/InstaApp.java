package com.sample.duncapham.instaapp;

import android.app.Application;
import android.content.Context;
import android.util.Log;
import android.widget.Toast;

import com.codepath.oauth.OAuthBaseClient;
import com.sample.duncapham.instaapp.oauth.InstagramApp;

/**
 * Created by duncapham on 7/22/15.
 */
public class InstaApp extends Application {
    private static Context context;
    public static String accessToken;

    public static String getAccessToken() {
        return accessToken;
    }

    public static void setAccessToken(String accessToken) {
        InstaApp.accessToken = accessToken;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        InstaApp.context = this;
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
    }
}
