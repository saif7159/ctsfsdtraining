package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/userapi")
public class UserController {
@Autowired
private UserDao dao;
@GetMapping("/alluser")
@ResponseBody
public List<User> getUsers()
{
	return dao.findAll();
}
}
