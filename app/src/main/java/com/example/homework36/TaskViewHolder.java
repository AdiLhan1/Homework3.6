package com.example.homework36;

import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class TaskViewHolder extends RecyclerView.ViewHolder {
    Task task;
    CheckBox checkBox;
    TextView title;
    ITaskAdapterListener listener;
    public TaskViewHolder(@NonNull View itemView) {
        super(itemView);
        title=itemView.findViewById(R.id.task_isDone);
        checkBox=itemView.findViewById(R.id.task_isDone);
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listener.openDetails(task);
            }
        });
    }
    public void onBind(Task task){
        title.setText(task.title);
        checkBox.setChecked(task.checkBox);
        this.task=task;
    }
}
