package com.example.ok.tagreb;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class SHareImageText extends AppCompatActivity {
    Button share;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_share_image_text);


        share= (Button) findViewById(R.id.share);

        share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent =new Intent(Intent.ACTION_SEND);
                intent.setType("Image/*");
                Uri uri=Uri.parse("android.resource://"+getPackageName()+"/drawable"+R.drawable.g1);

                intent.putExtra(Intent.EXTRA_STREAM,uri);
                intent.putExtra(Intent.EXTRA_TEXT,"مشاركه");

                Intent choser= Intent.createChooser(intent,"اختار للمشاركه");

                if (intent.resolveActivity(getPackageManager())!=null){

                    startActivity(intent);
                }


            }
        });

    }
}
