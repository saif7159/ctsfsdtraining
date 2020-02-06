package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Items;
import com.example.demo.service.ItemService;
@RestController
@RequestMapping("/")
public class RestItemController {
@Autowired
ItemService is;
@PostMapping("/createItem")
public Items createItem(@RequestBody Items item)
{
	return is.createItems(item);
}
@GetMapping("/items")
public List<Items> findAllItems()
{
	return is.getAllItems();
}
@GetMapping("/items/{id}")
public Optional<Items> findById(@PathVariable Integer id)
{
	return is.findById(id);
}
@GetMapping("/itemsname/{name}")
public List<Items> findByName(@PathVariable String name)
{
	return is.findByName(name);
}
@GetMapping("/itemsname/{name}/{id}")
public List<Items> findByName(@PathVariable String name, @PathVariable Integer id)
{
	return is.findByNameAndId(name, id);
}
@DeleteMapping("/items/{id}")
public void deleteById(@PathVariable Integer id)
{
	is.deleteById(id);
}
@DeleteMapping("/items/deleteall")
public void deleteAll()
{
	is.deleteAll();
}
}
