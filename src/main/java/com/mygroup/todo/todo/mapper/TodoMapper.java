package com.mygroup.todo.todo.mapper;

import com.mygroup.todo.todo.dto.TodoDto;
import com.mygroup.todo.todo.entity.TodoEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface TodoMapper {
	
	TodoMapper INSTANCE = Mappers.getMapper(TodoMapper.class);
	
	TodoDto toDto(TodoEntity todoEntity);
	
}
