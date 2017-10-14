package com.stackroute.zomoto.Foodies.interfce;

import java.util.List;

import org.springframework.stereotype.Component;

import com.stackroute.zomato.Foodies.domain.FoodiesModel;


public interface FoodiesService {
	
	public List<FoodiesModel> getAllRestaurant();
	public FoodiesModel addFoodiesModel(FoodiesModel foodiesmodel);
	public boolean deleteFoodiesModel(String id);
	//public boolean deleteFoodiesModel(FoodiesModel fm);
	
}
