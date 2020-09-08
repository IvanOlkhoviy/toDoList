package com.olkhoviy.todolist.controller;

import com.olkhoviy.todolist.domain.ToDoDTO;
import com.olkhoviy.todolist.service.ToDoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("todolist")
public class ToDoController {

    @Autowired
    ToDoService toDoService;

    @GetMapping("page")
    public ResponseEntity<?> getToDoByPage(@PageableDefault Pageable pageable){
        return new ResponseEntity<>(toDoService.getAllToDo(pageable), HttpStatus.OK);
    }

    @DeleteMapping("{toDoId}")
    public  ResponseEntity<?> deleteToDoById(@PathVariable("toDoId") Long id){
        toDoService.deleteToDo(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PostMapping()
    public ResponseEntity<?> createToDo(@RequestBody ToDoDTO toDoDTO){
        toDoService.createToDo(toDoDTO);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PostMapping("{toDoId}")
    public ResponseEntity<?> changeCompleteStatus(@PathVariable("toDoId") Long id){
        toDoService.changeCompleteStatus(id);
        return new ResponseEntity<>( HttpStatus.OK);
    }





}
