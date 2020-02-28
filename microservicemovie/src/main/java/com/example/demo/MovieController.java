package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movieapi")
public class MovieController {
@Autowired
MovieService ms;
@PostMapping("/create")
public Movie createMovie(@RequestBody Movie movie)
{
	return ms.createMovie(movie);
}
@GetMapping("/allmovies")
public ResponseEntity<?> getAllMovies()
{
	return ResponseEntity.ok(ms.getAllMovies());
}
@GetMapping("/movie/{id}")
public ResponseEntity<?> findById(@PathVariable int id)
{
	return ResponseEntity.ok(ms.findById(id));
}
@GetMapping("/moviebyname/{name}")
public ResponseEntity<?> findByName(@PathVariable String name)
{
	return ResponseEntity.ok(ms.findByName(name));
}
}
