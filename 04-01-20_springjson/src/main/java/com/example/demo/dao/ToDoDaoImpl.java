package com.example.demo.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.model.ToDo;
@Repository
public class ToDoDaoImpl implements ToDoDao {
	ToDo td = null;
	List<ToDo> list = null;
	{
		
		list = new ArrayList<ToDo>();
		
	}
	
	
	@Override
	public ToDo createToDo(int todoid, String todoname) {
		td = new ToDo(todoid, todoname);
		list.add(td);
		return td;
		
	}

	@Override
	public List<ToDo> getAllToDo() {
		
		return list;
	}

}
