package com.shivraj.moviecatalogservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.shivraj.moviecatalogservice.model.CatalogItem;
import com.shivraj.moviecatalogservice.model.Movie;
import com.shivraj.moviecatalogservice.model.Rating;

@Service
public class MovieInfo {

	@Autowired
	private RestTemplate restTemplate; 
	
	@HystrixCommand(fallbackMethod = "getFallbackCatalogItem")
	public CatalogItem getCatalogItem(Rating ratingObj) {
		Movie movie = restTemplate.getForObject("http://movie-info-service/movies/" + ratingObj.getMovieId(),
				Movie.class);
		return new CatalogItem(movie.getName(), movie.getDesc(), ratingObj.getRating());
	}

	public CatalogItem getFallbackCatalogItem(Rating ratingObj) {
		return new CatalogItem("No Movie record found", "", ratingObj.getRating());
	}
}
