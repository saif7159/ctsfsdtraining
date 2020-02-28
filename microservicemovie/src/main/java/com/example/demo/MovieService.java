package com.example.demo;

import java.util.List;
import java.util.Optional;



public interface MovieService {
public Movie createMovie(Movie movie);
public List<Movie> getAllMovies();
public Optional<Movie> findById(Integer id);
public Movie findByName(String name);

}
