package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.ToDoDao;
import com.example.demo.dao.ToDoDaoImpl;
import com.example.demo.model.ToDo;
@Service
public class ToDoServiceImpl implements ToDoService {
	ToDoDao tdao;
	@Autowired
	public ToDoServiceImpl(ToDoDaoImpl tdao) {
	this.tdao = tdao;
	}
	
	@Override
	public ToDo createToDo(int todoid, String todoname) {
		
		return tdao.createToDo(todoid, todoname);
	}

	@Override
	public List<ToDo> getAllToDo() {
		
		return tdao.getAllToDo();
	}

}
