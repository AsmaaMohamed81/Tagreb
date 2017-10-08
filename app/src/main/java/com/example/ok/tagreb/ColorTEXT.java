package com.example.ok.tagreb;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

public class ColorTEXT extends AppCompatActivity {
TextView text ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color_text);
        text=(TextView)findViewById(R.id.text);
        text.setText(Html.fromHtml("<span lang=\"en-us\"> hello <b><font color=\"#ff0000\">" +
                "welcome </font><b> to my <b><font color=\"#ffffff\"> channel</font> </b> </span>"));
    }
}
