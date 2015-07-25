package com.sample.duncapham.instaapp;

import android.content.Context;

import com.codepath.oauth.OAuthBaseClient;

import org.scribe.builder.api.Api;

/**
 * Created by duncapham on 7/22/15.
 */
public class InstaClient extends OAuthBaseClient{
    public static final Class<? extends Api> REST_API_CLASS = InstaApi.class; // Change this
    public static final String REST_URL = "https://api.instagram.com/v1"; // Change this, base API URL
    public static final String REST_CONSUMER_KEY = "5d6f866bdbf04ac38b6279222a118e59";       // Change this
    public static final String REST_CONSUMER_SECRET = "d7c089d132234365bb16b67e2180ba71"; // Change this
    public static final String REST_CALLBACK_URL = "http://univtop.com/"; // Change this (here and in manifest)

    public InstaClient(Context c) {
        super(c, REST_API_CLASS, REST_URL, REST_CONSUMER_KEY, REST_CONSUMER_SECRET, REST_CALLBACK_URL);
    }
}
