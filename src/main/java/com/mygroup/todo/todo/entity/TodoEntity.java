package com.mygroup.todo.todo.entity;

import com.mygroup.todo.category.entity.CategoryEntity;
import jakarta.persistence.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity(name = "TodoEntity")
@Table(name = "todo")
public class TodoEntity {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "title", length = 25, nullable = false)
    private String title;

    @Column(name = "description", length = 45)
    private String description;

    @Column(name="is_done", nullable = false)
    private boolean isDone;

    @ManyToOne(fetch = FetchType.EAGER,  optional = false)
    @JoinColumn(name = "category_id", nullable = true)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private CategoryEntity category;

    public int getId() {
        return id;
    }

    public TodoEntity setId(int id) {
        this.id = id;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public TodoEntity setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public TodoEntity setDescription(String description) {
        this.description = description;
        return this;
    }

    public boolean getIsDone() {
        return isDone;
    }

    public TodoEntity setFoo(boolean done) {
        isDone = done;
        return this;
    }

    public CategoryEntity getCategory() {
        return category;
    }

    public TodoEntity setCategory(CategoryEntity categoryEntity) {
        this.category = categoryEntity;
        return this;
    }
}
