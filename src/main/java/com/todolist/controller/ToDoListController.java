package com.todolist.controller;

import com.todolist.ToDoItems;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("todolist")
public class ToDoListController {
    @Autowired
    private ToDoItems toDoItems;

    @GetMapping(value = "/welcome-page")
    public String getWelcomePage() {
        return "Welcome to our application";
    }

    @GetMapping(value = "/add-new-item", params = { "item" })
    public void getWelcomePage(@RequestParam String item) {
        toDoItems.addToList(item);
        toDoItems.getToDoItems().stream().forEach(System.out::println);
        System.out.println("Item added to new list");
    }

//    @PostMapping(value = )
}
