package com.to_do.app.models;


import jakarta.persistence.Entity;

@Entity
public class ToDoModel extends BaseModel{
    private String taskName;
    private boolean completed;
    
    public ToDoModel() {
    }

    public ToDoModel(String taskName, boolean completed) {
        this.taskName = taskName;
        this.completed = completed;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    
}
