package com.example.ok.tagreb;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageButton;
// من غير نت ويب فيو حمل صفات زي حكايات اطفال شغاله وري بعض من غير نت بس ينستدعي html

public class hkyat extends AppCompatActivity {
    ImageButton next, back;
    WebView web;
    int i;

@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hkyat);

        next = (ImageButton) findViewById(R.id.next);
        back = (ImageButton) findViewById(R.id.back);
        web = (WebView) findViewById(R.id.web);

        web.loadUrl("file:///android_asset/s1.html");




        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (i < 9)
                    i++;
                web.loadUrl("file:///android_asset/s" + i + ".html");

            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (i > 1)
                    i--;
                web.loadUrl("file:///android_asset/s" + i + ".html");
            }
        });
    }
}
