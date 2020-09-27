package com.saanvisoft.model;

import lombok.NonNull;

public class Ratings {

	public Ratings(String movieId, int rating) {
		super();
		this.movieId = movieId;
		this.rating = rating;
	}

	private String movieId = "";
	@NonNull
	private int rating;
	public String getmovieId() {
		return movieId;
	}
	public void setmovieId(String movieId) {
		this.movieId = movieId;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}



}
