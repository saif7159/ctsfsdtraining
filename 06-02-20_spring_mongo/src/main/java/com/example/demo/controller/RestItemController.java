package com.example.demo.controller;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
	item.setDate(LocalDate.now());
	return is.createItems(item);
}
@PutMapping("/createItem")
public Items updateItem(@RequestBody Items item)
{	item.setDate(LocalDate.now());
	return is.updateItem(item);
}
@GetMapping("/items")
public List<Items> findAllItems()
{
	return is.getAllItems();
}
@GetMapping("/items/{isbn}")
public Items findById(@PathVariable Integer isbn)
{
	return is.findByIsbn(isbn);
}
@GetMapping("/itemsname/{name}")
public List<Items> findByName(@PathVariable String name)
{
	return is.findByName(name);
}
@GetMapping("/itemsandname/{name}/{isbn}")
public List<Items> findByNameAndIsbn(@PathVariable String name, @PathVariable Integer isbn)
{
	return is.findByNameAndIsbn(name, isbn);
}
@GetMapping("/itemsorname/{name}/{isbn}")
public List<Items> findByNameOrIsbn(@PathVariable String name, @PathVariable Integer isbn)
{
	return is.findByNameOrIsbn(name, isbn);
}

@DeleteMapping("/items/{isbn}")
public void deleteByIsbn(@PathVariable Integer isbn)
{
	is.deleteByIsbn(isbn);
}
@DeleteMapping("/items/deleteall")
public void deleteAll()
{
	is.deleteAll();
}
}
