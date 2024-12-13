package com.praneeth.works.projects.socialinternship;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;

public class SplachScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splach_screen);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

            }
        },3000);
    }
}