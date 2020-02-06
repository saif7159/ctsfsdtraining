package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;
import com.example.demo.service.UserService;
import com.example.demo.shared.SharedUser;

@RestController
@RequestMapping("/")
public class UserController {
private UserService us;
@Autowired
public UserController(UserService us) {
	super();
	this.us = us;
}
@PostMapping("/users")
public SharedUser createUser(@RequestBody User user)
{
	return us.createUser(user);
}
@GetMapping("users/{id}")
public SharedUser findById(@PathVariable Integer id)
{
	return us.findByID(id);
}

}
