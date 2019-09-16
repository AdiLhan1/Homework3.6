package com.example.homework36;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;

public class TaskDetailsActivity extends AppCompatActivity {
    static  final String DETAILS_KEY="details_key";
    EditText title,description,prichina,doctor;
    CheckBox checkBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task_details);
    }
    private void setupView(){
        title=findViewById(R.id.details_title);
        description=findViewById(R.id.details_description);
        prichina=findViewById(R.id.details_prichina);
        doctor=findViewById(R.id.details_doctor);
        checkBox=findViewById(R.id.details_isDone);


    }
    public void onClickSave(View view) {
        Intent intent=getIntent();
        String title1=title.getText().toString();
        String description1=description.getText().toString();
        String prichina1=prichina.getText().toString();
        String doctor1=doctor.getText().toString();
        Task task = new Task(title1,description1,prichina1,doctor1);
        intent.putExtra( "key", task);
        setResult(RESULT_OK, intent);
        finish();

    }
}
