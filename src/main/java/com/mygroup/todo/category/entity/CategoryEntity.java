package com.mygroup.todo.category.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.mygroup.todo.todo.entity.TodoEntity;
import jakarta.persistence.*;

import java.util.List;

@Entity(name = "Category")
@Table(name = "category")
public class CategoryEntity {

    @Id
    private int id;

    @Column(length = 25, nullable = false)
    private String name;

    @OneToMany(mappedBy = "category",
            targetEntity = TodoEntity.class,
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY,
            orphanRemoval = true)
    @JsonIgnore
    private List<TodoEntity> todos;

    public int getId() {
        return id;
    }

    public CategoryEntity setId(int id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public CategoryEntity setName(String name) {
        this.name = name;
        return this;
    }

    public List<TodoEntity> getTodos() {
        return todos;
    }

    public CategoryEntity setTodos(List<TodoEntity> todos) {
        this.todos = todos;
        return this;
    }
}
