package com.example.ok.tagreb;

import android.app.NotificationManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.NotificationCompat;
import android.view.View;
import android.widget.Button;

import static android.app.Notification.DEFAULT_SOUND;
import static android.app.Notification.DEFAULT_VIBRATE;

public class Notification extends AppCompatActivity {

    Button notify;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification);

        notify= (Button) findViewById(R.id.notify);


        notify.setOnClickListener(new View.OnClickListener() {
            
            @Override
            public void onClick(View view) {

                NotificationManager notifymanger=(NotificationManager)getSystemService(Context.NOTIFICATION_SERVICE);
                Bitmap bmp= BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.g2);

                NotificationCompat.Builder builder= (NotificationCompat.Builder) new NotificationCompat.Builder(getApplicationContext())
                        .setContentText("اشعارت اشعارت اشعارت")
                        .setContentTitle("اشعارات")
                        .setSmallIcon(R.drawable.g1)
                        .setLargeIcon(bmp)
                        .setAutoCancel(true)
                        .setNumber(1);

                builder.setDefaults(DEFAULT_SOUND | DEFAULT_VIBRATE);
                builder.setVibrate(new long[]{500,1000,500,1000,500});
                builder.setSound(Uri.parse("android_resource://"+getPackageName()+R.raw.thrown));


                notifymanger.notify(1,builder.build());




            }
        });


    }

}
