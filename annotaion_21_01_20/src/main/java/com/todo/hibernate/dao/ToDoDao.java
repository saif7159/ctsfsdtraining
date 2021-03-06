package com.todo.hibernate.dao;

import java.time.LocalDateTime;
import java.util.List;

import com.todo.hibernate.model.ToDo;

public interface ToDoDao {
public ToDo createToDo(ToDo todo);
public List<ToDo> getAllToDo();
public ToDo findById(int id);
public ToDo updateToDo(int id, String taskname, LocalDateTime now);
public void deleteTodo(int id);
public void saveAndExit();
}
