package com.mygroup.todo.category.mapper;

import com.mygroup.todo.category.dto.CategoryDto;
import com.mygroup.todo.category.entity.CategoryEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CategoryMapper {
	
	CategoryMapper INSTANCE = Mappers.getMapper(CategoryMapper.class);
	
	CategoryDto toDto(CategoryEntity categoryEntity);
}
