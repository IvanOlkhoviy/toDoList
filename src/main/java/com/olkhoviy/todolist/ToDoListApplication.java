package com.olkhoviy.todolist;

import com.olkhoviy.todolist.entity.ToDoEntity;
import com.olkhoviy.todolist.repository.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ToDoListApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(ToDoListApplication.class, args);

    }

    @Autowired
    ToDoRepository toDoRepository;

    @Override
    public void run(String... args) throws Exception {
        if (toDoRepository.count()==0){
            ToDoEntity toDoEntity1 = new ToDoEntity();
            toDoEntity1.setText("Make a new video game");
            toDoRepository.save(toDoEntity1);

            ToDoEntity toDoEntity2 = new ToDoEntity();
            toDoEntity2.setText("Feed dog");
            toDoRepository.save(toDoEntity2);

            ToDoEntity toDoEntity3 = new ToDoEntity();
            toDoEntity3.setText("Draw Mona Lisa");
            toDoRepository.save(toDoEntity3);

            ToDoEntity toDoEntity4 = new ToDoEntity();
            toDoEntity4.setText("Make a lot of money");
            toDoRepository.save(toDoEntity4);

            ToDoEntity toDoEntity5 = new ToDoEntity();
            toDoEntity5.setText("Do some exercises");
            toDoRepository.save(toDoEntity5);

            ToDoEntity toDoEntity6 = new ToDoEntity();
            toDoEntity6.setText("Drink milk");
            toDoRepository.save(toDoEntity6);
        }

    }
}
