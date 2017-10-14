package com.stackroute.zomato.Foodies.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stackroute.zomato.Foodies.domain.FoodiesModel;
import com.stackroute.zomato.Foodies.repository.FoodiesRepository;
import com.stackroute.zomoto.Foodies.interfce.FoodiesService;

@Service
public class DbFoodiesService implements FoodiesService{
	   
	@Autowired
	FoodiesRepository foodiesrepository;

	public List<FoodiesModel> getAllRestaurant( )
	   {
	     return (List) foodiesrepository.findAll();
	   }
	   
    public FoodiesModel addFoodiesModel(FoodiesModel foodiesmodel) {
    	
    	foodiesrepository.save(foodiesmodel);
    	return foodiesmodel;
   }
	public boolean deleteFoodiesModel(String id)  {
		//System.out.println("I am here");
		foodiesrepository.delete(id);
		return true;
	}
    
//    public boolean deleteFoodiesModel(FoodiesModel fm) {
//    	FoodiesModel ff = foodiesrepository.findOne(fm.getRestaurantId());
//    	System.out.println(ff);
////    	foodiesrepository.delete(fm.getRestaurantId());
//    	return true;
//    }
}
