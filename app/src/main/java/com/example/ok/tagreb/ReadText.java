package com.example.ok.tagreb;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ReadText extends AppCompatActivity {
TextView textread;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_read_text);

        textread=(TextView)findViewById(R.id.textread);

//        InputStream input= null;
//
//        try {
//
//            input =getAssets().open("read.txt");
//
//            int size=input.available();
//            byte[] addtext=new byte[size];
//            input.read(addtext);
//            input.close();
//
//            String txt=new String(addtext);
//            textread.setText(txt);
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }



        StringBuilder text=new StringBuilder();

        try {
            InputStream input = getAssets().open("read.txt");
            InputStreamReader isr = new InputStreamReader(input);
            BufferedReader br = new BufferedReader(isr);

            try {
                String line;
                while ((line=br.readLine())!=null){
                    text.append(line);
                    text.append('\n');
                }

            }
            catch (IOException e){}
        } catch (IOException e) {
            e.printStackTrace();
        }

        textread.setText(text);

    }
}
