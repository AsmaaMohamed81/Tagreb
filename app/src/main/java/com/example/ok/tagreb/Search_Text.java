package com.example.ok.tagreb;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Search_Text extends AppCompatActivity {
    TextView all,cal;
    EditText esarch;
    Button txt,search;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search__text);

        txt=(Button)findViewById(R.id.txt);
        search=(Button)findViewById(R.id.Bsearch);

        all=(TextView)findViewById(R.id.alltext);
        cal=(TextView)findViewById(R.id.cal);

        esarch=(EditText)findViewById(R.id.Esearch);





        txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                StringBuilder txt = new StringBuilder();

                try {
                    InputStream IS = getAssets().open("adam.txt");
                    InputStreamReader ISR = new InputStreamReader(IS);
                    BufferedReader BR =  new BufferedReader(ISR);
                 try {
                     String line;
                     while ((line= BR.readLine())!=null) {
                         txt.append(line);
                         txt.append('\n');
                     }
                 } catch (IOException e){}

                } catch (IOException e) {
                    e.printStackTrace();
                }

                all.setText(txt);

            }
        });

        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int total=0;
                String word_search=esarch.getText().toString().trim();
                String alltxt= all.getText().toString();

                String [] array = alltxt.split(" ");
                String word;
                StringBuilder sb= new StringBuilder();

                for (int i=0 ; i<array.length ; i++){

                    word = array[i];
                    if (word.contains(word_search)){
                        sb.append("<b><font color=\"#FF0000\">" + word.trim() + "</font></b>");
                        sb.append("\n");
                        total++;
                    }else {
                        sb.append(word);

                    }
                    sb.append(" ");


                }

                all.setText(Html.fromHtml(""+sb));
                cal.setText("عدد كلمات البحث : " + total);

            }
        });

    }
}
