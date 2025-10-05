package com.mygroup.todo.todo.dto;

import com.mygroup.todo.category.dto.CategoryDto;

public class TodoDto {

    private int id;
    private String title;
    private String description;
    private boolean isDone;

    private CategoryDto category;

    public int getId() {
        return id;
    }

    public TodoDto setId(int id) {
        this.id = id;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public TodoDto setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public TodoDto setDescription(String description) {
        this.description = description;
        return this;
    }

    public boolean getIsDone() {
        return isDone;
    }

    public TodoDto setIsDone(boolean done) {
        isDone = done;
        return this;
    }

    public CategoryDto getCategory() {
        return category;
    }

    public TodoDto setCategory(CategoryDto category) {
        this.category = category;
        return this;
    }
}
