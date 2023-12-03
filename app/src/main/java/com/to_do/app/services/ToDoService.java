package com.to_do.app.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.to_do.app.dto.incoming.ToDoDto;
import com.to_do.app.models.ToDoModel;
import com.to_do.app.repositories.ToDoRepository;

@Service
public class ToDoService {
    @Autowired
    private ToDoRepository toDoRepository;

    public ToDoService() {
    }

    public ToDoDto createToDo(ToDoDto dto) {
        return new ToDoDto(toDoRepository.save(new ToDoModel(dto)));
    }

    public boolean updateToDo(ToDoDto dto) {
        ToDoModel model = new ToDoModel(dto);
        boolean updated = false;
        if (getToDoDtoById(model.getId()) != null) {
            toDoRepository.save(model);
            updated = true;
        }
        return updated;
    }

    public List<ToDoDto> getAllToDos() {
        Iterable<ToDoModel> models = toDoRepository.findAll();
        ArrayList<ToDoDto> dtos = new ArrayList<>();
        for (ToDoModel model : models) {
            dtos.add(new ToDoDto(model));
        }
        return dtos;
    }

    public ToDoDto getToDoDtoById(long id) {
        Optional<ToDoModel> opt = toDoRepository.findById(id);
        ToDoDto dto = null;
        if (opt.isPresent()) {
            dto = new ToDoDto(opt.get());
        }
        return dto;
    }

    public boolean deleteToDoById(long id) {
        boolean exist = getToDoDtoById(id) != null;
        toDoRepository.deleteById(id);
        return exist;
    }

}
