/*
 * package com.saanvisoft.demo;
 * 
 * import java.util.Arrays; import java.util.List; import
 * java.util.stream.Collectors;
 * 
 * import org.springframework.web.client.RestTemplate;
 * 
 * import com.saanvisoft.model.CatalogItem; import com.saanvisoft.model.Movie;
 * import com.saanvisoft.model.Ratings;
 * 
 * public class Test {
 * 
 * public static void main(String atgs[]) { RestTemplate tmpObj; List<Ratings>
 * ratings = Arrays.asList(new Ratings("111", 1), new Ratings("111", 5));
 * 
 * ratings.stream().map(rating -> {
 * 
 * Movie movie = tmpObj.getForObject("http://localhost:8082/movies/" +
 * rating.getMovieId(), Movie.class); new CatalogItem(movie.getName(),
 * "Nice Movie", rating.getRating());
 * 
 * // return Collections.singletonList(new CatalogItem("Transformers", "Nice //
 * Movie", 4));
 * 
 * } return rating; ),collect(Collectors.toList()); } }
 */