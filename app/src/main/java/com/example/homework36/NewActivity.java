package com.example.homework36;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import static com.example.homework36.TaskDetailsActivity.DETAILS_KEY;

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
        showTask(getTask());
    }
    private Task getTask(){
        Intent intent=getIntent();
        Task task =(Task)intent.getSerializableExtra(DETAILS_KEY);
        return task;
    }
    private void showTask(Task task){
        headline.setText(task.title);
        description.setText(task.descreption);
        prichina.setText(task.prichina);
        doctor.setText(task.doctor);

    }
}
