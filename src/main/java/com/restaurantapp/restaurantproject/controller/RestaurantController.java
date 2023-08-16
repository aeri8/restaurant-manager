package com.restaurantapp.restaurantproject.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.restaurantapp.restaurantproject.entity.Restaurant;
import com.restaurantapp.restaurantproject.model.dto.RestaurantDto;
import com.restaurantapp.restaurantproject.service.RestaurantService;

@RestController
@RequestMapping("api/restaurant")
public class RestaurantController {
	
	
	private final RestaurantService restaurantService;

	public RestaurantController(RestaurantService restaurantService) {
		super();
		this.restaurantService = restaurantService;
	}
	
	
	@GetMapping
	public List<RestaurantDto> findAll(){
		return restaurantService.getAll();
	}
	

	
	@PostMapping
	public RestaurantDto create(@RequestBody Restaurant restaurant){
		return restaurantService.create(restaurant);
	}	
	
	@PutMapping("/{id}")
	public RestaurantDto update(@PathVariable int id,@RequestBody Restaurant restaurant) {
		return restaurantService.update(id,restaurant);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable int id) {
		restaurantService.delete(id);
	}
}
