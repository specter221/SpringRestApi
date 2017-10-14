package com.stackroute.zomato.Foodies.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.stackroute.zomato.Foodies.domain.FoodiesModel;
import com.stackroute.zomato.Foodies.service.DbFoodiesService;
import com.stackroute.zomoto.Foodies.interfce.FoodiesService;
import com.stackroute.zomato.Foodies.service.DbFoodiesService;

@RestController
@RequestMapping("/v0.1/zomatoservice")
public class FoodiesController {
	
	@Autowired
	private FoodiesService foodiesservice;
	
	@RequestMapping(value="/foodies" , method=RequestMethod.GET)
	public ResponseEntity  getAllRestaurant() {
		List <FoodiesModel>	foodie = foodiesservice.getAllRestaurant();	
		return new ResponseEntity<List<FoodiesModel>>(foodie,HttpStatus.OK);
				
	}
	
    @RequestMapping(value="/foodies", method=RequestMethod.POST, consumes="application/json")
	   public ResponseEntity addRestaurant(@RequestBody FoodiesModel foodiesmodel)
	   {
	       /*Add validation code*/        
	        foodiesservice.addFoodiesModel(foodiesmodel);
	       return new ResponseEntity<String>("List Added", HttpStatus.OK) ;
	   }
	    

@RequestMapping(value="/foodies/{id}",method=RequestMethod.DELETE, consumes="application/json" )
  public ResponseEntity <String> deleteRestaurant(@PathVariable(value="id") int id) {
      	
	    foodiesservice.deleteFoodiesModel(Integer.toString(id));
        
        return new ResponseEntity<String> ("yes done",HttpStatus.OK);
    }
//	public ResponseEntity<String> deleteRestaurant(RequestEntity<FoodiesModel> deleteData) {
//		System.out.println("till here");
//		foodiesservice.deleteFoodiesModel(deleteData.getBody());
//		return new ResponseEntity<String> ("yes done",HttpStatus.OK);
//	}
}



	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	//	@RequestMapping(value="/Foodies" , method=RequestMethod.POST)
//	public ResponseEntity  <FoodiesModel> saveRestaurant(FoodiesModel model) {
//		FoodiesModel foodie= new FoodiesModel(3, "Mcd", 200, "kormanagala");
//		
//		try {
//			//service.save(model);
//		}
//		catch(ResturantAlreadyExist rAE) {
//			return new ResponseEntity<String>(e.getMessage(),HttpStatus.Conflict);
//		}
//		
//		return new ResponseEntity<FoodiesModel>(foodie,HttpStatus.OK);
//		}

	
	
//	@RequestMapping(value="/Foodies" , method=RequestMethod.POST)
//	public FoodiesModel getSaveRestaurant() {
//		return new FoodiesModel(3, "Mcd", 200, "kormanagala");
//		
//	}
//	

//@RequestMapping(value="/foodies" , method=RequestMethod.DELETE)
//public ResponseEntity  <FoodiesModel> deleteRestaurant() {
//	FoodiesModel foodie= new FoodiesModel(0,"Delete is ok",0,"delete is ok");
//	return new ResponseEntity<FoodiesModel>(foodie,HttpStatus.OK);
//}

	
