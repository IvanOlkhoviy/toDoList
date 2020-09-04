package com.olkhoviy.todolist.entity;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name = "ToDo")

@Getter
@Setter
@NoArgsConstructor
public class ToDoEntity extends BaseEntity {

    @Column(name = "toDoText", nullable = false, length = 500)
    private String text;
}
