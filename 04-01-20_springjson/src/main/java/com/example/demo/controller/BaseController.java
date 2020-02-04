package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.ToDo;
import com.example.demo.service.ToDoService;
import com.example.demo.service.ToDoServiceImpl;

@RestController
@RequestMapping("/todos")
public class BaseController {
ToDoService tds;
@Autowired
public BaseController(ToDoServiceImpl tds)
{
	this.tds = tds;
	
}
@GetMapping("/")
public List<ToDo> getAllToDos()
{	tds.createToDo(1, "t1");
	tds.createToDo(2, "t2");
	tds.createToDo(3, "t3");
	tds.createToDo(4, "t4");
	tds.createToDo(5, "t5");
	return tds.getAllToDo();
}
}
