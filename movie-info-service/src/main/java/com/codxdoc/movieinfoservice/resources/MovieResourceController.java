package com.codxdoc.movieinfoservice.resources;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codxdoc.movieinfoservice.models.Movie;

@RestController
@RequestMapping("/movies")
public class MovieResourceController {
	
	@RequestMapping("/{movieId}")
	public Movie getMovieInfo(@PathVariable("movieId") String movieId) {
		return new Movie(movieId, "The best of youth");
		
	}

}
