package com.olkhoviy.todolist.repository;


import com.olkhoviy.todolist.entity.ToDoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ToDoRepository extends JpaRepository<ToDoEntity,Long> {
}
