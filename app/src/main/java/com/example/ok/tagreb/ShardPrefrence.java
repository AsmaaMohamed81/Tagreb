package com.example.ok.tagreb;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ShardPrefrence extends AppCompatActivity {
    Button save,load;
    EditText name;
    TextView here;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shard_prefrence);

        save= (Button) findViewById(R.id.save);
        load= (Button) findViewById(R.id.load);

        name= (EditText) findViewById(R.id.name);
        here= (TextView) findViewById(R.id.here);



        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences shard = getSharedPreferences("file",Context.MODE_PRIVATE);
                SharedPreferences.Editor edit=shard.edit();
                edit.putString("name",name.getText().toString());
                edit.apply();



            }
        });

        load.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                SharedPreferences shard = getSharedPreferences("file",Context.MODE_PRIVATE);
                String name = shard.getString("name","00");
                here.setText(name);





            }
        });






    }
}
