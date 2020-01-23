package com.listexample.todo;

import java.util.List;

public interface Service {
	void createToDo(String name);
	List<ToDo> getAllToDo();
	ToDo findById(String todoid);
	public ToDo updateById(String todoid, String updatetask);
	public void removeAll();
	public void removeById(String todoid);
}
