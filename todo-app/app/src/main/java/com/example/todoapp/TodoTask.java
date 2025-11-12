package com.example.todoapp;

public class TodoTask {
    private String task;
    private boolean completed;

    public TodoTask(String task) {
        this.task = task;
        this.completed = false;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
}
