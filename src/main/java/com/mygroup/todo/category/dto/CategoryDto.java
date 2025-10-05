package com.mygroup.todo.category.dto;

public class CategoryDto {

    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public CategoryDto setId(int id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public CategoryDto setName(String name) {
        this.name = name;
        return this;
    }
}
