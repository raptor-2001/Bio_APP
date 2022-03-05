package com.prathamyadav006.bio_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class secondActivity extends AppCompatActivity {
    TextView bio_data;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        bio_data = (TextView) findViewById(R.id.text2);
        Intent intent = getIntent();
        String n = intent.getStringExtra("Name");
        String e = intent.getStringExtra("Email");
        String g = intent.getStringExtra("Gender");

        bio_data.setText(n +"\n\n"+e+"\n\n"+g);
    }
}