package com.restaurantapp.restaurantproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.restaurantapp.restaurantproject.entity.Menu;

public interface MenuRepository extends JpaRepository<Menu, Integer> {
	
}
