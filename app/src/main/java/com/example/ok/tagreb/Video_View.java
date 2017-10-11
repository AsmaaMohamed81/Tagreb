package com.example.ok.tagreb;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class Video_View extends AppCompatActivity {
VideoView videoView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video__view);

        videoView = (VideoView)findViewById(R.id.video);

        String ui="http://www.ebookfrenzy.com/android_book/movie.mp4";




        Uri uri=Uri.parse(ui);

        videoView.setVideoURI(uri);
        videoView.setMediaController(new MediaController(this));
        videoView.requestFocus();
        videoView.start();
    }
}

