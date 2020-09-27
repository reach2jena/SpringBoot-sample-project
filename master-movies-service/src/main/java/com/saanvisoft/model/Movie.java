package com.saanvisoft.model;

public class Movie {

	
	
	public Movie(int movieId, String name) {
		super();
		this.movieId = movieId;
		this.name = name;
	}
	private int movieId;
	private String name;
	public int getMovieId() {
		return movieId;
	}
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
