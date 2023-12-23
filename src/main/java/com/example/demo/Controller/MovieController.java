package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Movie;
import com.example.demo.Service.Movieservice;

@RestController
@RequestMapping("/api")
public class MovieController {
	
	@Autowired
	private Movieservice movieservice;

	@PostMapping("/save")
	public int savemovie(@RequestBody Movie movie) {
		movieservice.save(movie);
		return 1;
	}
	
	@GetMapping("/all")
	public ResponseEntity<List<Movie>> getAllMovies(){
		return new ResponseEntity<List<Movie>>(movieservice.Allmovies(),HttpStatus.OK);
	}

}
