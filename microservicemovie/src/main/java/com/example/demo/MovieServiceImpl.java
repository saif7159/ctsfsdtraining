package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Service
@EnableTransactionManagement
public class MovieServiceImpl implements MovieService {
	MovieDao mdao;
	@Autowired
	public MovieServiceImpl(MovieDao mdao) {
		super();
		this.mdao = mdao;
	}
	@Override
	public Movie createMovie(Movie movie) {

		return mdao.save(movie);
	}
	@Override
	public List<Movie> getAllMovies() {
		return mdao.findAll();
	}
	@Override
	public Optional<Movie> findById(Integer id) {
		
		return mdao.findById(id);
	}
	@Override
	public Movie findByName(String name) {
		
		return mdao.findByName(name);
	}

}
