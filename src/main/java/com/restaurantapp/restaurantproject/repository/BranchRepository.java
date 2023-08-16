package com.restaurantapp.restaurantproject.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.restaurantapp.restaurantproject.entity.Branch;


public interface BranchRepository extends JpaRepository<Branch, Integer>{
	
	public List<Branch> findByRestaurantId(int id);
	
}
