package com.listexample.todo;

import java.util.List;

public class ServiceImplementation implements Service {
	ToDoDao td = null;
	{
		td = new ToDoDaoImplementation();
	}
	@Override
	public void createToDo(String name) {
		// TODO Auto-generated method stub
		td.createToDo(name);
	}

	@Override
	public List<ToDo> getAllToDo() {
		// TODO Auto-generated method stub
		return td.getAllToDo();
	}

	@Override
	public ToDo findById(String todoid) {
		// TODO Auto-generated method stub
		return td.findById(todoid);
	}

	@Override
	public ToDo updateById(String todoid, String updatetask) {
		// TODO Auto-generated method stub
		return td.updateById(todoid, updatetask);
	}

	@Override
	public void removeAll() {
		// TODO Auto-generated method stub
		td.removeAll();
	}

	@Override
	public void removeById(String todoid) {
		// TODO Auto-generated method stub
		td.removeById(todoid);
	}

}
