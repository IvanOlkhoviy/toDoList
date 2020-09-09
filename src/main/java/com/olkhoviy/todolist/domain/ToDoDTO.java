package com.olkhoviy.todolist.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class ToDoDTO {

    private Long id;

    private String title;

    private boolean isCompleted;

}
