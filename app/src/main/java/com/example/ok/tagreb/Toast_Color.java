package com.example.ok.tagreb;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Toast_Color extends AppCompatActivity {
Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toast__color);

        b=(Button)findViewById(R.id.b1);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

              Toast tost=  Toast.makeText(Toast_Color.this, "السلام عليكم ورحمه الله وبركاته", Toast.LENGTH_SHORT);
                View b = tost.getView();
                b.setBackgroundColor(Color.parseColor("#FFFF4081"));
                tost.setGravity(Gravity.CENTER,0,0);
                tost.show();


            }
        });
    }
}
