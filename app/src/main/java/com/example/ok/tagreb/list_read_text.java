package com.example.ok.tagreb;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class list_read_text extends AppCompatActivity {
    ListView list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_read_text);

        list = (ListView) findViewById(R.id.list);


        // String[] llist = getResources().getStringArray(R.array.liste);

        String[] llist = new String[11];
        try {
            InputStream input = getAssets().open("name.txt");
            InputStreamReader isr = new InputStreamReader(input);
            BufferedReader br = new BufferedReader(isr);

            try {
                String line;
                int id = 0;
                while ((line = br.readLine()) != null) {

                    llist[id] = line;
                    id++;

                }

            } catch (IOException e) {
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


        ArrayAdapter adapter = new ArrayAdapter<String>(this, R.layout.list_item, R.id.text, llist);
        list.setAdapter(adapter);
    }
}
