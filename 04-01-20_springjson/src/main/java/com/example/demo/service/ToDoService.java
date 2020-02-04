package com.example.demo.service;

import java.util.List;

import com.example.demo.model.ToDo;

public interface ToDoService {
	public ToDo createToDo(int todoid, String todoname);
	public List<ToDo> getAllToDo();
}
