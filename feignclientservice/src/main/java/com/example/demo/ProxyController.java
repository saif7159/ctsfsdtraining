package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class ProxyController {
@Autowired
private UserServiceClient us;
@RequestMapping("/products")
public List<Product> getAllUsers()
{
	return us.getUsers();
}
}
