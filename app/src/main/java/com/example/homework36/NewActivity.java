package com.example.homework36;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class NewActivity extends AppCompatActivity {
    TextView headline,description,prichina,doctor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);
        headline=findViewById(R.id.new_headline);
        description=findViewById(R.id.new_description);
        prichina=findViewById(R.id.new_adress);
        doctor=findViewById(R.id.new_hobbi);

    }
}
