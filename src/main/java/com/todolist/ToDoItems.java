package com.todolist;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Component
public class ToDoItems {
    private List<String> toDoItems = Collections.synchronizedList(new ArrayList<>());

    public void addToList(String item) {
        this.toDoItems.add(item);
    }

    public List<String> getToDoItems() {
        return toDoItems;
    }
}
