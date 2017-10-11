package com.example.ok.tagreb;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Cal_Sum extends AppCompatActivity {
    Button sum;
    EditText first,second;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cal__sum);


        sum= (Button) findViewById(R.id.sum);

        first= (EditText) findViewById(R.id.fist_num);
        second= (EditText) findViewById(R.id.second_num);

        result= (TextView) findViewById(R.id.ruslt);



        sum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int n1 = Integer.parseInt(first.getText().toString());
                int n2 =Integer.parseInt(second.getText().toString());
                int n3=n1+n2;

                result.setText(String.valueOf(n3));
            }
        });
    }
}
