package com.prathamyadav006.bio_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {
    EditText name;
    EditText email;

    RadioGroup radiogroup;
    RadioButton radioButton;
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.name);
        email = findViewById(R.id.email);
        radiogroup = findViewById(R.id.radioGroup);
        submit =  findViewById(R.id.submit);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String n = name.getText().toString();
                String e = email.getText().toString();

                int radioId = radiogroup.getCheckedRadioButtonId();
                radioButton = findViewById(radioId);
                String g = radioButton.getText().toString();

                Intent intent = new Intent(MainActivity.this , secondActivity.class);
                intent.putExtra("Name", n);
                intent.putExtra("Email", e);
                intent.putExtra("Gender", g);

                startActivity(intent);
            }
        });
    }

}