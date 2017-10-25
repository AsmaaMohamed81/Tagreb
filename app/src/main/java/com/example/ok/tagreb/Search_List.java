package com.example.ok.tagreb;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Search_List extends AppCompatActivity {
    TextView cal;
    ListView tlist;
    EditText esarch;
    Button txt, search;

    ArrayList Alist = new ArrayList();
    ArrayList Alist_Search = new ArrayList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search__list);

        txt = (Button) findViewById(R.id.txt);
        search = (Button) findViewById(R.id.Bsearch);

        tlist = (ListView) findViewById(R.id.list);

        cal = (TextView) findViewById(R.id.cal);

        esarch = (EditText) findViewById(R.id.Esearch);


    }

    public void search(View view) {

        Alist_Search.clear();
        String item_search = esarch.getText().toString().trim();

        for (int i = 0; i < Alist.size(); i++) {
            String item = Alist.get(i).toString();

            if (item.contains(item_search)) {
                Alist_Search.add(item);

            }
        }
        ArrayAdapter Aps = new ArrayAdapter(this, R.layout.list_item, R.id.text, Alist_Search);
        tlist.setAdapter(Aps);
        cal.setText("مجموع العنواين : " + Alist_Search.size());
    }


    public void txt(View view) {


        Alist.clear();

        try {
            InputStream Is = getAssets().open("rttr.txt");
            InputStreamReader ISR = new InputStreamReader(Is);
            BufferedReader BR = new BufferedReader(ISR);


            try {
                String line;
                while ((line = BR.readLine()) != null) {
                    Alist.add(line);

                }

            } catch (IOException e) {


            }

        } catch (IOException e) {
            e.printStackTrace();
        }


        ArrayAdapter Ap = new ArrayAdapter(this, R.layout.list_item, R.id.text, Alist);
        tlist.setAdapter(Ap);
        cal.setText("مجموع العنواين : " + Alist.size());

    }
}