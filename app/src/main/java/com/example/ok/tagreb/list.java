package com.example.ok.tagreb;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class list extends AppCompatActivity {
ListView list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        list=(ListView)findViewById(R.id.list);


        String[] llist = getResources().getStringArray(R.array.liste);
        ArrayAdapter adapter = new ArrayAdapter<String>(this,R.layout.list_item,R.id.text,llist);
        list.setAdapter(adapter);

    }
}
