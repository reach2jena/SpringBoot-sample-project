package com.saanvisoft.service;

import java.util.Arrays;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.saanvisoft.model.Ratings;

@RestController
@RequestMapping("/ratings")
public class RatingsServiceResource {

	@GetMapping("/{movieId}")
	public Ratings getratings(@PathVariable("movieId") String movieId)
	{
		
		System.out.println("MovieID"+ movieId);
		return new Ratings("Transformers", 5);
	}
	
	@GetMapping("users/{userId}")
	public List<Ratings> geMovieratings(@PathVariable("userId") String userId, HttpServletRequest request)
	{

		 return  Arrays.asList(new Ratings("001", 1), new Ratings("002", 5));
	}
}
