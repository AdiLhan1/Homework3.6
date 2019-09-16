package com.example.homework36;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class TaskAdapter extends RecyclerView.Adapter<TaskViewHolder> {
    ArrayList<Task> tasks;
    public TaskAdapter(){
        tasks=new ArrayList<>();
    }
    @NonNull
    @Override
    public TaskViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.view_holder_task,parent,false);
        TaskViewHolder vh=new TaskViewHolder(view);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull TaskViewHolder holder, int position) {
        holder.onBind(tasks.get(position));
    }

    @Override
    public int getItemCount() {
        return tasks.size();
    }
}
