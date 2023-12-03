package com.to_do.app.dto.incoming;

import com.to_do.app.models.BaseModel;

public abstract class BaseDto {
    private long id;

    public BaseDto() {
    }

    public BaseDto(BaseModel model) {
        this.id = model.getId();
    }

}
