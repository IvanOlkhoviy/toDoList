package com.olkhoviy.todolist.service.impl;

import com.olkhoviy.todolist.domain.ToDoDTO;
import com.olkhoviy.todolist.entity.ToDoEntity;
import com.olkhoviy.todolist.repository.ToDoRepository;
import com.olkhoviy.todolist.service.ToDoService;
import com.olkhoviy.todolist.utils.ObjectMapperUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ToDoServiceImpl implements ToDoService {

    @Autowired
    ObjectMapperUtils modelMapper;
    @Autowired
    ToDoRepository toDoRepository;


    @Override
    public void createToDo(ToDoDTO toDoDTO) {
        ToDoEntity toDoEntity = modelMapper.map(toDoDTO,ToDoEntity.class);
        toDoRepository.save(toDoEntity);
    }

    @Override
    public void deleteToDo(Long id) {
        toDoRepository.deleteById(id);
    }

    @Override
    public Page<ToDoEntity> getAllToDo(Pageable pageable) {
        return toDoRepository.findAll(pageable);
    }

    @Override
    public void changeCompleteStatus(Long id) {
         ToDoEntity toDoEntity = toDoRepository.getOne(id);
         toDoEntity.setCompleted(!toDoEntity.isCompleted());
         toDoRepository.save(toDoEntity);

    }
}
