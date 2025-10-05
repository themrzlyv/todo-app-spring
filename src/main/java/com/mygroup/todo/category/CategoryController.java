package com.mygroup.todo.category;

import com.mygroup.todo.category.dto.CategoryDto;
import com.mygroup.todo.category.mapper.CategoryMapper;
import com.mygroup.todo.category.repo.CategoryRepo;
import com.mygroup.todo.common.dto.CommonDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/category")
public class CategoryController {

    private final CategoryRepo repository;

    public CategoryController(CategoryRepo repository) {
        this.repository = repository;
    }

    @GetMapping
    public CommonDto getAll() {
        final List<CategoryDto> list = repository.findAll()
                .stream().map(CategoryMapper.INSTANCE::toDto).toList();
        return new CommonDto<List<CategoryDto>>()
                .setData(list)
                .setMessage("Success");
    }

    @GetMapping("{id}")
    public CommonDto getCategoryById(@PathVariable() Integer id) {
        final CategoryDto result = repository.findById(id)
            .map(CategoryMapper.INSTANCE::toDto)
            .orElse(new CategoryDto());

        return new CommonDto<CategoryDto>()
                .setData(result)
                .setMessage("Success");
    }


}
