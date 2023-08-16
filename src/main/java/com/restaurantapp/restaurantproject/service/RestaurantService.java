package com.restaurantapp.restaurantproject.service;

import java.util.List;

import com.restaurantapp.restaurantproject.entity.Restaurant;
import com.restaurantapp.restaurantproject.model.dto.RestaurantDto;

public interface RestaurantService {
	
	
	public List<RestaurantDto> getAll();
	public RestaurantDto create(Restaurant restaurant);
	public RestaurantDto update(int id,Restaurant restaurant);
	public void delete(int id); 
}
