package com.todolist.controller;

import com.todolist.ToDoItems;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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
    public String addNewItem(@RequestParam String item) {
       //to do
        return ""; //<- this you can delete, add this just to make this method return something
    }

    @GetMapping(value = "/show-to-do-items")
    public List<String> showToDoItems() {
        //to do
        return List.of(); //<- this you can delete, add this just to make this method return something
    }
}
