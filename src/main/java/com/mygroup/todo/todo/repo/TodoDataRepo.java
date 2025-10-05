package com.mygroup.todo.todo.repo;

import com.mygroup.todo.todo.entity.TodoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoDataRepo extends JpaRepository<TodoEntity, Integer> {

}
