package com.to_do.app.dto.incoming;

import com.to_do.app.models.ToDoModel;

public class ToDoDto extends BaseDto{
    private String taskName;
    private boolean completed;

    public ToDoDto() {

    }

    public ToDoDto(ToDoModel model) {        
        super(model);
        this.taskName = model.getTaskName();
        this.completed = model.isCompleted();
        
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
