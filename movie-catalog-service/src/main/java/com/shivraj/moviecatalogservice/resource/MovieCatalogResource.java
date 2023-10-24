package com.shivraj.moviecatalogservice.resource;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.shivraj.moviecatalogservice.model.CatalogItem;
import com.shivraj.moviecatalogservice.model.Movie;
import com.shivraj.moviecatalogservice.model.Rating;
import com.shivraj.moviecatalogservice.model.UserRating;
import com.shivraj.moviecatalogservice.service.MovieInfo;
import com.shivraj.moviecatalogservice.service.UserRatingInfo;

@RestController
@RequestMapping("/catalog")
@RefreshScope  // It is to load the updated values from properties/yml file while getting the properties from spring cloud config server
public class MovieCatalogResource {
	
	@Value("${my.testPropvalue}")
	private String test;
	
	@Value("${profile.name}")
	private String profile;

	@Autowired
	private RestTemplate restTemplate;

	@Autowired
	UserRatingInfo userRatingInfo;

	@Autowired
	MovieInfo movieInfo;

	@RequestMapping("/{userId}")
	public List<CatalogItem> getCatalog(@PathVariable("userId") String userId) {
		UserRating ratings = userRatingInfo.getUserRating(userId);
		return ratings.getUserRatings().stream().map(ratingObj -> {
			// For each movie Id , Call movie info service and get details

			return movieInfo.getCatalogItem(ratingObj);
		}).collect(Collectors.toList());

	}

	// Hystrix Fallback methods won't work if it is same class and call from some
	// method because Hystrix works on Class proxy So, you method and fall back
	// should be in separate call and then Autowired it in other class

//	public List<CatalogItem> getFallbackCatalog(@PathVariable("userId") String userId) {
//		return Arrays.asList(new CatalogItem("No Movie", "", 0));
//	}

}
