package com.sample.duncapham.instaapp;

/**
 * Created by duncapham on 7/22/15.
 */

import android.content.Context;
import com.codepath.oauth.OAuthBaseClient;

import org.scribe.builder.api.Api;
import org.scribe.builder.api.TwitterApi;



/*
 *
 * This is the object responsible for communicating with a REST API.
 * Specify the constants below to change the API being communicated with.
 * See a full list of supported API classes:
 *   https://github.com/fernandezpablo85/scribe-java/tree/master/src/main/java/org/scribe/builder/api
 * Key and Secret are provided by the developer site for the given API i.e dev.twitter.com
 * Add methods for each relevant endpoint in the API.
 *
 * NOTE: You may want to rename this object based on the service i.e TwitterClient or FlickrClient
 *
 */
public class TwitterClient extends OAuthBaseClient {
    public static final Class<? extends Api> REST_API_CLASS = TwitterApi.class; // Change this
    public static final String REST_URL = "https://api.twitter.com/1.1"; // Change this, base API URL
    public static final String REST_CONSUMER_KEY = "XdyCEpZkGLpilVHRawFxAaUVC";       // Change this
    public static final String REST_CONSUMER_SECRET = "WNOo9NHqDJdNjKnJQhmgLXdlb4zzOEv0e4I3lEvobQ6fkQI1Oh"; // Change this
    public static final String REST_CALLBACK_URL = "oauth://cpbasictweets"; // Change this (here and in manifest)

    // maxId used for pagination
//	public long maxId = 0;
    public long sinceId = 0;
    String tweet = "";
    long tweetId = 0;

    public TwitterClient(Context context) {
        super(context, REST_API_CLASS, REST_URL, REST_CONSUMER_KEY, REST_CONSUMER_SECRET, REST_CALLBACK_URL);
    }

}