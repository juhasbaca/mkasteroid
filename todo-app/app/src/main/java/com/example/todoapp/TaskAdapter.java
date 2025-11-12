package com.example.todoapp;

import android.content.Context;
import android.graphics.Paint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;

import java.util.List;

public class TaskAdapter extends ArrayAdapter<TodoTask> {
    private Context context;
    private List<TodoTask> tasks;

    public TaskAdapter(Context context, List<TodoTask> tasks) {
        super(context, 0, tasks);
        this.context = context;
        this.tasks = tasks;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.task_item, parent, false);
        }

        TodoTask currentTask = tasks.get(position);

        CheckBox checkBoxTask = convertView.findViewById(R.id.checkBoxTask);
        Button buttonDelete = convertView.findViewById(R.id.buttonDelete);

        checkBoxTask.setText(currentTask.getTask());
        checkBoxTask.setChecked(currentTask.isCompleted());

        // Strike through text if completed
        if (currentTask.isCompleted()) {
            checkBoxTask.setPaintFlags(checkBoxTask.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
        } else {
            checkBoxTask.setPaintFlags(checkBoxTask.getPaintFlags() & (~Paint.STRIKE_THRU_TEXT_FLAG));
        }

        checkBoxTask.setOnCheckedChangeListener((buttonView, isChecked) -> {
            currentTask.setCompleted(isChecked);
            if (isChecked) {
                checkBoxTask.setPaintFlags(checkBoxTask.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
            } else {
                checkBoxTask.setPaintFlags(checkBoxTask.getPaintFlags() & (~Paint.STRIKE_THRU_TEXT_FLAG));
            }
        });

        buttonDelete.setOnClickListener(v -> {
            tasks.remove(position);
            notifyDataSetChanged();
        });

        return convertView;
    }
}
