
package com.example.ok.tagreb;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class Picassoo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_picasso);
        ImageView img = (ImageView)findViewById(R.id.img);
        Picasso.with(this).load("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRWQbFN_wyY914ja_xM4l4l1maHduhnJtEB5Rhn_TMBxzzWmQKZ1vOlcsY").into(img);
    }
}
