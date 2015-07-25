package com.sample.duncapham.instaapp.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.support.v4.app.Fragment;

import com.sample.duncapham.instaapp.InstaApp;
import com.sample.duncapham.instaapp.R;

/**
 * Created by duncapham on 7/22/15.
 */
public class InstaFeedFragment extends PageFragment{

    public static InstaFeedFragment newInstance() {
        InstaFeedFragment fragment = new InstaFeedFragment();
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_page, container, false);
        TextView textView = (TextView) view;
        textView.setText(InstaApp.getAccessToken());
        return view;
    }
}
