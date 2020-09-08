package com.olkhoviy.todolist.service;


import com.olkhoviy.todolist.domain.ToDoDTO;
import com.olkhoviy.todolist.entity.ToDoEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


public interface ToDoService {

    void createToDo(ToDoDTO toDoDTO);

    void deleteToDo(Long id);

    Page<ToDoEntity> getAllToDo(Pageable pageable);

    void changeCompleteStatus(Long id);

}
