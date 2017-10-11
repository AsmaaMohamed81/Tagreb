package com.example.ok.tagreb;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class All extends AppCompatActivity {
    Button alert,cal,hkyat,audio,web,shard,vidioview,color,gallry,
            admob,start,toast,call,toastimg,picasso,shareimge,notify,textread,list,listread,clortext,map;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all);

        alert= (Button) findViewById(R.id.alert);
        hkyat= (Button) findViewById(R.id.asset);
        audio= (Button) findViewById(R.id.audio);
        cal= (Button) findViewById(R.id.cal);
        web= (Button) findViewById(R.id.web);
        shard= (Button) findViewById(R.id.shard);
        vidioview= (Button) findViewById(R.id.video);
        color= (Button) findViewById(R.id.color_picker);

        gallry= (Button) findViewById(R.id.gallry);
        admob= (Button) findViewById(R.id.admob);
        start= (Button) findViewById(R.id.start);
        toast= (Button) findViewById(R.id.toast);
        call= (Button) findViewById(R.id.call);
        picasso= (Button) findViewById(R.id.picasso);

        toastimg= (Button) findViewById(R.id.toastimg);

        shareimge= (Button) findViewById(R.id.shareaimagText);
        notify= (Button) findViewById(R.id.notification);
        textread= (Button) findViewById(R.id.textread);
        call= (Button) findViewById(R.id.call);
        list= (Button) findViewById(R.id.list);
        listread= (Button) findViewById(R.id.listread);

        clortext= (Button) findViewById(R.id.colortext);
        map= (Button) findViewById(R.id.map);







        alert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent asset = new Intent(All.this,Alert.class);
                startActivity(asset);

            }
        });

        hkyat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent asset = new Intent(All.this,hkyat.class);
                startActivity(asset);

            }
        });


        audio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent asset = new Intent(All.this,Raw.class);
                startActivity(asset);

            }
        });


        cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent asset = new Intent(All.this,Cal_Sum.class);
                startActivity(asset);

            }
        });

        web.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent asset = new Intent(All.this,WebViewww.class);
                startActivity(asset);

            }
        });


        shard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent asset = new Intent(All.this,ShardPrefrence.class);
                startActivity(asset);

            }
        });

        vidioview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent asset = new Intent(All.this,Video_View.class);
                startActivity(asset);

            }
        });

        color.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent asset = new Intent(All.this,Color_Picker.class);
                startActivity(asset);

            }
        });

        gallry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent asset = new Intent(All.this,Gallry.class);
                startActivity(asset);

            }
        });

        admob.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent asset = new Intent(All.this,AdMob.class);
                startActivity(asset);

            }
        });

        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent asset = new Intent(All.this,StartUp.class);
                startActivity(asset);

            }
        });


        toast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent asset = new Intent(All.this,Toast_Color.class);
                startActivity(asset);

            }
        });

        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent asset = new Intent(All.this,Call.class);
                startActivity(asset);

            }
        });

        toastimg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent asset = new Intent(All.this,Toast_Image.class);
                startActivity(asset);

            }
        });

        picasso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent asset = new Intent(All.this,Picassoo.class);
                startActivity(asset);

            }
        });
        toastimg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent asset = new Intent(All.this,Toast_Image.class);
                startActivity(asset);

            }
        });

        shareimge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent asset = new Intent(All.this,SHareImageText.class);
                startActivity(asset);

            }
        });
        notify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent asset = new Intent(All.this,Notification.class);
                startActivity(asset);

            }
        });
        textread.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent asset = new Intent(All.this,ReadText.class);
                startActivity(asset);

            }
        });

        list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent asset = new Intent(All.this,list.class);
                startActivity(asset);

            }
        });

        listread.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent asset = new Intent(All.this,list_read_text.class);
                startActivity(asset);

            }
        });

        clortext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent asset = new Intent(All.this,ColorTEXT.class);
                startActivity(asset);

            }
        });

        map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent asset = new Intent(All.this,MapsActivity.class);
                startActivity(asset);

            }
        });



    }
}
