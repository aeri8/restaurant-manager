package com.restaurantapp.restaurantproject.service;

import java.util.List;

import com.restaurantapp.restaurantproject.entity.Branch;
import com.restaurantapp.restaurantproject.model.dto.BranchDto;

public interface BranchService {
	
	public List<BranchDto> getAll();
	public List<BranchDto> findByRestaurantId(int id);
	public BranchDto  create(Branch branch);
	public BranchDto update(int id,Branch branch);
	public void delete(int id);
}	



	
	

