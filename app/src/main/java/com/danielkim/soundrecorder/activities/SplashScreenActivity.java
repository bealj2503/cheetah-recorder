package com.danielkim.soundrecorder.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.preference.PreferenceManager;
import android.widget.ImageView;

import com.danielkim.soundrecorder.R;

public class SplashScreenActivity extends AppCompatActivity {

    AnimationDrawable rocketAnimation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        SharedPreferences shared = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
        if(shared.getBoolean("Dark_Mode", false)){
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
        }
        else{
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        }
        setContentView(R.layout.activity_splash_screen);

    }

    @Override
    protected void onResume() {
        super.onResume();

        runMainDelay();
    }

    public void runMainDelay(){
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            public void run() {
                runMain();
            }
        }, 835);   //.835 seconds
    }

    public void runMain(){

        // variabes
        Intent myIntent;

        myIntent = new Intent(this, MainActivity.class);
        this.startActivity(myIntent);
    }

}