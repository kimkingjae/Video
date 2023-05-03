package com.example.video;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        VideoView videoView =(VideoView) findViewById(R.id.videoView);
        Uri uri = Uri.parse("android.resource://"+getPackageName()+R.raw.fountain_night);

        MediaController mc = new MediaController(this);
        videoView.setMediaController(mc);
        videoView.setVideoURI(uri);
        videoView.start();
        videoView.setVisibility(View.VISIBLE);


    }

}

