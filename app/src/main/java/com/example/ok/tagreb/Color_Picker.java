package com.example.ok.tagreb;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import net.margaritov.preference.colorpicker.ColorPickerDialog;

public class Color_Picker extends AppCompatActivity {

    Button b;
    TextView t;
    LinearLayout lay;
    ColorPickerDialog pickcolor;
    int color;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color__picker);

        b= (Button) findViewById(R.id.button);
        t= (TextView) findViewById(R.id.te);
        lay= (LinearLayout) findViewById(R.id.lay);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                color= Color.parseColor("#ffffff");
                pickcolor=new ColorPickerDialog(Color_Picker.this,color);
                pickcolor.setAlphaSliderVisible(true);
                pickcolor.setTitle("PICK");

                pickcolor.setOnColorChangedListener(new ColorPickerDialog.OnColorChangedListener() {
                    @Override
                    public void onColorChanged(int color) {

                        t.setText("#"+Integer.toHexString(color));
                        t.setTextColor(color);

                        lay.setBackgroundColor(color);




                    }
                });


                pickcolor.show();
            }
        });




    }
}
