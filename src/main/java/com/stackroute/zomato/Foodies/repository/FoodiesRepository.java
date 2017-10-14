package com.stackroute.zomato.Foodies.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.stackroute.zomato.Foodies.domain.FoodiesModel;

@Repository
public interface FoodiesRepository extends CrudRepository<FoodiesModel,String>{
	


}

