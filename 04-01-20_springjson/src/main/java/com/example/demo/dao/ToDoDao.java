package com.example.demo.dao;

import java.util.List;

import com.example.demo.model.ToDo;

public interface ToDoDao {
public ToDo createToDo(int todoid, String todoname);
public List<ToDo> getAllToDo();
}
