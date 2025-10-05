package com.mygroup.todo.category.repo;

import com.mygroup.todo.category.entity.CategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepo extends JpaRepository<CategoryEntity, Integer> {
}
