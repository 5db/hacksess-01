package com.example.hacksess_01;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends Activity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent intent = getIntent();

        TextView tView = new TextView(this);
        tView.setText("I'm Second Activity");

        setContentView(tView);
    }
}