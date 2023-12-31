package com.to_do.app.models;

import com.to_do.app.dto.incoming.BaseDto;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class BaseModel {
    @GeneratedValue
    @Id
    private long id;

    public BaseModel() {
    }

    public BaseModel(BaseDto dto) {
        this.id = dto.getId();
    }

    public BaseModel(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

}
