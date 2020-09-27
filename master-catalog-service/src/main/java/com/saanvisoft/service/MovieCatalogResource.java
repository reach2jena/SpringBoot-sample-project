package com.saanvisoft.service;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import com.saanvisoft.model.CatalogItem;
import com.saanvisoft.model.Movie;
import com.saanvisoft.model.Ratings;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogResource {

	@Autowired()
	private RestTemplate tmpObj;

	@Autowired
	private WebClient.Builder webclientBuilder;
	
	@RequestMapping("/{userId}")
	public List<CatalogItem> getCatlogdata(@PathVariable("userId") String userId) {
		System.out.println("Testing 123....");
		
		tmpObj.getForObject("http://localhost:8083/ratings/foo", Ratings.class);
		
		List<Ratings> ratings = Arrays.asList(new Ratings("001", 1), new Ratings("002", 5));
		
		return ratings.stream().map( rating -> {
		
			Movie movie = tmpObj.getForObject("http://localhost:8082/movies/"+rating.getMovieId(), Movie.class);
//			Movie movie = webclientBuilder.build()
//			.get()
//			.uri("http://localhost:8082/movies/"+rating.getMovieId())
//			.retrieve().bodyToMono(Movie.class).block();
		
		
		return new CatalogItem(movie.getName(), "RJ53014", rating.getRating());
		}).collect(Collectors.toList());
		//return Collections.singletonList(new CatalogItem("Transformers", "Nice Movie", 4));
	}
}
