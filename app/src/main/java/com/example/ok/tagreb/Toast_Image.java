package com.example.ok.tagreb;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Toast_Image extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toast__image);


        Button show = (Button) findViewById(R.id.show);



        show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast = new Toast(Toast_Image.this);
                toast.setDuration(Toast.LENGTH_LONG);
                toast.setGravity(Gravity.CENTER,0,0);

                LayoutInflater ly =getLayoutInflater();

                View v=ly.inflate(R.layout.activity_toast__image_item, (ViewGroup)findViewById(R.id.lay));

                TextView txt1=(TextView)v.findViewById(R.id.textView1);
                TextView txt2=(TextView)v.findViewById(R.id.textView2);

                txt1.setText("مرحبا بيك في تجربتي");
                txt2.setText("اجري يامجدييييييييي");

                toast.setView(v);
                toast.show();
            }
        });



    }
}
