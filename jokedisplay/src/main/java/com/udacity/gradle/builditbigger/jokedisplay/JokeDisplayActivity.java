package com.udacity.gradle.builditbigger.jokedisplay;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class JokeDisplayActivity extends AppCompatActivity {
    public static String JOKE_KEY = "JOKE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke_display);
        TextView textView = (TextView) findViewById(R.id.joke);
        if(getIntent() != null && getIntent().hasExtra(JOKE_KEY)){
            textView.setText(getIntent().getStringExtra(JOKE_KEY));
        }
    }
}
