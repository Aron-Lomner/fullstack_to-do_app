package com.to_do.app.repositories;

import org.springframework.data.repository.CrudRepository;

import com.to_do.app.models.ToDoModel;

public interface ToDoRepository extends CrudRepository<ToDoModel, Long> {
    
}
