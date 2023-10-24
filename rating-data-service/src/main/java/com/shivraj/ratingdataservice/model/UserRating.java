package com.shivraj.ratingdataservice.model;

import java.util.List;

import com.shivraj.ratingdataservice.model.Rating;

public class UserRating {

	private List<Rating> userRatings;
	
	public UserRating()
	{
		
	}

	public UserRating(List<Rating> userRatings) {
		super();
		this.userRatings = userRatings;
	}

	public List<Rating> getUserRatings() {
		return userRatings;
	}

	public void setUserRatings(List<Rating> userRatings) {
		this.userRatings = userRatings;
	}
	
	
}
