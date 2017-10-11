package com.example.ok.tagreb;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;


// شغل الويب فيو علي موبيلك مش يطلع بره الجهاز يحمل الصفحه بره

public class WebViewww extends AppCompatActivity {
Button go;
    EditText url;
    WebView webview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);
        go= (Button) findViewById(R.id.go);
        url= (EditText) findViewById(R.id.url);
        webview= (WebView) findViewById(R.id.webview);

        webview.setWebViewClient(new WebViewClient());

        go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {




                webview.loadUrl(url.getText().toString());
            }
        });



    }
}
