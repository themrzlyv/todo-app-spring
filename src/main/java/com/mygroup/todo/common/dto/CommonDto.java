package com.mygroup.todo.common.dto;

import java.time.LocalDateTime;

public class CommonDto<T> {

    private T data;

    private String message;

    private LocalDateTime datetime =  LocalDateTime.now();

    public T getData() {
        return data;
    }

    public CommonDto setData(T object) {
        this.data = object;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public CommonDto setMessage(String message) {
        this.message = message;
        return this;
    }

    public LocalDateTime getDatetime() {
        return datetime;
    }

    public CommonDto setDatetime(LocalDateTime datetime) {
        this.datetime = datetime;
        return this;
    }
}
