package com.example.demo.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.Entity.Movie;

import com.example.demo.Repository.MovieRepository;

@Service
public class Movieservice {

	@Autowired
	private MovieRepository movieRepository;
	
	public void save(@RequestBody Movie movie ) {
		movieRepository.save(movie);
		
	}

	public List<Movie> Allmovies(){
		return movieRepository.findAll(); 
	}
	
	public Optional<Movie> singleMovie(UUID id) {
		return movieRepository.findById(id);
	}

}
