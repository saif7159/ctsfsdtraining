package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Player;
import com.example.demo.service.PlayerService;
import com.example.demo.service.PlayerServiceImpl;

@RestController
@RequestMapping("/")
public class BaseController {
PlayerService ps;
@Autowired
public BaseController(PlayerServiceImpl ps)
{
	this.ps = ps;
}
@GetMapping("/")
public List<Player> getAllPlayers()
{
	return ps.getPlayers();
}

@GetMapping("/players/{id}")
public Optional<Player> getPlayer(@PathVariable Integer id)
{
return ps.getById(id);	
}
}
