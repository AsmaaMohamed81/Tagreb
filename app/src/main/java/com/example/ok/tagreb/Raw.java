package com.example.ok.tagreb;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Raw extends AppCompatActivity {
Button play;
    @Override

// تسمع موسيقي

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_raw);

        final MediaPlayer mediaPlayer =MediaPlayer.create(Raw.this,R.raw.h);

        play= (Button) findViewById(R.id.play);

        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer.start();
            }
        });




    }
}
