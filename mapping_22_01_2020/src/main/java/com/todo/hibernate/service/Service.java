package com.todo.hibernate.service;

import java.time.LocalDateTime;
import java.util.List;

import com.todo.hibernate.model.Task;
import com.todo.hibernate.model.ToDo;

public interface Service {
	public ToDo createToDo(ToDo todo);
	public List<ToDo> getAllToDo();
	public ToDo findById(int id);
	public ToDo updateToDo(int id, LocalDateTime now, Task task);
	public void deleteTodo(int id);
	public void saveAndExit();
}
