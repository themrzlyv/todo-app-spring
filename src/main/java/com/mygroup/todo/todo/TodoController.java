package com.mygroup.todo.todo;

import com.mygroup.todo.common.dto.CommonDto;
import com.mygroup.todo.todo.dto.TodoDto;
import com.mygroup.todo.todo.mapper.TodoMapper;
import com.mygroup.todo.todo.repo.TodoDataRepo;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/todos")
public class TodoController {


    private final TodoDataRepo repository;

    public TodoController(final TodoDataRepo dataRepo) {
        this.repository = dataRepo;
    }

    @GetMapping
    public CommonDto getTodos() {
        List<TodoDto> result = repository.findAll().stream()
                .map(TodoMapper.INSTANCE::toDto)
                .toList();
        return new CommonDto<List<TodoDto>>()
                .setData(result)
                .setMessage("success");
    }

    @GetMapping("/{id}")
    public CommonDto getTodoById(@PathVariable() Integer id) {
        final TodoDto result = repository.findById(id)
                .map(TodoMapper.INSTANCE::toDto)
                .orElse(new TodoDto());
        return new CommonDto<TodoDto>().setData(result).setMessage("success");
    }
}
