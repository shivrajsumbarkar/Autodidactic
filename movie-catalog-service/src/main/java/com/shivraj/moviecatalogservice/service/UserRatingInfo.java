package com.shivraj.moviecatalogservice.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.shivraj.moviecatalogservice.model.Rating;
import com.shivraj.moviecatalogservice.model.UserRating;

@Service
public class UserRatingInfo {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@HystrixCommand(fallbackMethod = "getFallbackUserRating",
			threadPoolKey = "")
	public UserRating getUserRating(@PathVariable("userId") String userId) {
		return restTemplate.getForObject("http://rating-data-service/ratingdata/users/" + userId, UserRating.class);
		// RestTemplate calls Eureka server to get the service 'rating-data-service' details i.e. port and host
	}
	
	public UserRating getFallbackUserRating(@PathVariable("userId") String userId) {
		UserRating userRating=new UserRating();
		//userRating.setuserId
		userRating.setUserRatings(Arrays.asList(new Rating("0", 0), new Rating("0", 0)));
		return userRating;
	}
	
	

}
