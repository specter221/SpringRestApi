package com.stackroute.zomato.Foodies.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

//@Entity
@Document(collection="foodie")
public class FoodiesModel {

	@Id
	private String id;
	private String restaurantName;
	private String cost;
	private String restaurantAddress;
	

	
//	public FoodiesModel(String restaurantId, String restaurantName, String cost, String restaurantAddress) {
//		super();
//		this.restaurantId = restaurantId;
//		this.restaurantName = restaurantName;
//		this.cost = cost;
//		this.restaurantAddress = restaurantAddress;
//	}
//	
//	public FoodiesModel() {
//		
//	}

	// Getters and Setters are created
	public String getRestaurantId() {
		return id;
	}

	public void setRestaurantId(String id) {
		this.id = id;
	}

	public String getRestaurantName() {
		return restaurantName;
	}

	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
	}

	public String getCost() {
		return cost;
	}

	public void setCost(String cost) {
		this.cost = cost;
	}

	public String getRestaurantAddress() {
		return restaurantAddress;
	}

	public void setRestaurantAddress(String restaurantAddress) {
		this.restaurantAddress = restaurantAddress;
	}
	
	
	
	
	
	
	
}
