package com.stackroute.zomato.Foodies;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import com.stackroute.zomato.Foodies.domain.FoodiesModel;
import com.stackroute.zomato.Foodies.repository.FoodiesRepository;
import com.stackroute.zomato.Foodies.service.DbFoodiesService;
import com.stackroute.zomoto.Foodies.interfce.FoodiesService;

import static org.mockito.Mockito.*;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class ServiceTest {

  private DbFoodiesService dbfoodiesservice;
   @Mock
   private FoodiesRepository foodiesrepository;
   @Mock
   private FoodiesService  foodiesservice;
   @Before
   
   public void setupMock() {
       MockitoAnnotations.initMocks(this);
       dbfoodiesservice=new DbFoodiesService();
      // dbfoodiesservice.setFoodiesRepository(foodiesrepository);
   }
   @Test
   public void shouldReturnProduct_whenGetProductByIdIsCalled() throws Exception {
       // Arrange
       when(foodiesrepository.findOne(5)).thenReturn((FoodiesModel) foodiesservice);
       // Act
      // FoodiesService retrievedProduct = dbfoodiesservice.getProductById(5);
       // Assert
       //assertThat(retrievedProduct, is(equalTo(foodiesservice)));

  }
   @Test
   public void shouldReturnProduct_whenSaveProductIsCalled() throws Exception {
       // Arrange
      // when(foodiesrepository.save foodiesservice)).thenReturn(foodiesservice);
       // Act
       //FoodiesService savedProduct = foodiesrepository.saveProduct(foodiesservice);
       // Assert
      // assertThat(savedProduct, is(equalTo(foodiesservice)));
   }
   
   @Test
   public void shouldCallDeleteMethodOfProductRepository_whenDeleteProductIsCalled() throws Exception {
       // Arrange
       doNothing().when(foodiesrepository).delete(5);
       FoodiesRepository my = Mockito.mock(FoodiesRepository.class);
       // Act
      // dbfoodiesservice.deleteProduct(5);
       // Assert
       verify(foodiesrepository, times(1)).delete(5);
   }
}