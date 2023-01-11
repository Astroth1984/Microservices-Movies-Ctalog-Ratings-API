package com.codxdoc.ratingdataservice.resources;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codxdoc.ratingdataservice.models.Rating;

@RestController
@RequestMapping("/ratingsdata")
public class RatingResourceController {

	@RequestMapping("/{movieId}")
	public Rating getRating(@PathVariable("movieId") String movieId) {
		return new Rating(movieId, 4);
	}
}
