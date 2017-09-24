package com.example.ok.tagreb;



import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Gallry extends AppCompatActivity {
    Button next, back;
    ImageView img;
    int i;

    int[] gllary = new int[]{R.drawable.g1, R.drawable.g2, R.drawable.g3, R.drawable.g4};
    int n = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallry);

        next = (Button) findViewById(R.id.next);
        back = (Button) findViewById(R.id.back);
        img = (ImageView) findViewById(R.id.web);


        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                img.setImageResource(gllary[n]);


                if (n < 3)
                    n++;

            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                img.setImageResource(gllary[n]);

                if (n > 0)
                    n--;
            }
        });
    }
}
