package com.example.KyotoApp;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.widget.MediaController;
import android.widget.VideoView;

import android.os.Bundle;

public class ShrinedanTample extends AppCompatActivity {

    ActionBar actionBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shrinedan_tample);
        setTitle(" ");

        actionBar = getSupportActionBar();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        VideoView videoView = (VideoView) findViewById(R.id.idVideo3);
        videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName()+"/"+R.raw.shintodanbudha));

        MediaController mediaController = new MediaController(this);
        videoView.setMediaController(mediaController);
        mediaController.setAnchorView(videoView);
        videoView.start();
    }

    @Override
    public boolean onSupportNavigateUp(){
        onBackPressed();
        return true;
    }

    @Override
    public void onBackPressed(){
        super.onBackPressed();
    }
}