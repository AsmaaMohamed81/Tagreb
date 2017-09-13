package com.example.ok.tagreb;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.startapp.android.publish.adsCommon.StartAppAd;
import com.startapp.android.publish.adsCommon.StartAppSDK;

public class StartUp extends AppCompatActivity {
    private StartAppAd startAppAd = new StartAppAd(this);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_start_up);
        StartAppSDK.init(this, "208083326", true);


//        startAppAd.showAd(); // show the ad
//        startAppAd.loadAd(); // load the next ad

        StartAppAd.showSplash(this,savedInstanceState);

    }

    @Override
    public void onBackPressed() {
        startAppAd.onBackPressed(this);
        super.onBackPressed();
    }
}
