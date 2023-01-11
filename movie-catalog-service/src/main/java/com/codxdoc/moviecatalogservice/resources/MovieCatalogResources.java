package com.codxdoc.moviecatalogservice.resources;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.codxdoc.moviecatalogservice.models.CatalogItem;
import com.codxdoc.moviecatalogservice.models.Movie;
import com.codxdoc.moviecatalogservice.models.Rating;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogResources {
	
	@Autowired
	private RestTemplate restTemplate; 
	
	@GetMapping("/{userId}")
	public List<CatalogItem> getCatalog(@PathVariable("userId") String userId){
		// get all rated movies IDs - hard coded Ratings (for now)
		// Assuming this is th response from Rating-Data-Api
		List<Rating> ratings = Arrays.asList(
					new Rating("58ef9c", 4),
					new Rating("569gu8", 2),
					new Rating("96djf6", 5)
				);
		
		return ratings.stream().map(rating -> {
			Movie movie = restTemplate.getForObject("http://localhost:8181/movies/" + rating.getMovieId(), Movie.class);
			return new CatalogItem(movie.getName(), "some Desc", rating.getRating());
		})
		.collect(Collectors.toList());
			
		
		// For each movie, call movie-info service and get details
		
		// put all together
		
		/*
		return Collections.singletonList(
					new CatalogItem("Amadeus", "a biography about the musician Amadeus Wolfgang Mozart", 5)
				);
		*/
	}
}
