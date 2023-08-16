package com.restaurantapp.restaurantproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.restaurantapp.restaurantproject.entity.Restaurant;
public interface RestaurantRepository extends JpaRepository<Restaurant, Integer>{	
}
