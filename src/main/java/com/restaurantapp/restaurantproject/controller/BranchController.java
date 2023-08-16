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

import com.restaurantapp.restaurantproject.entity.Branch;
import com.restaurantapp.restaurantproject.model.dto.BranchDto;
import com.restaurantapp.restaurantproject.service.BranchService;

@RestController
@RequestMapping("/api/branch")
public class BranchController {
	

	private final BranchService branchService ;
	
	
	public BranchController(BranchService branchService) {
		super();
		this.branchService = branchService;
	}
	

	@GetMapping
	public List<BranchDto> findAll(){
		return branchService.getAll();
	}	
	
	@GetMapping("/{id}")
	 public List<BranchDto> getByRestaurantId(@PathVariable("id") int id) {
		 return branchService.findByRestaurantId(id);
	 }
	
	@PostMapping
	public BranchDto create(@RequestBody Branch branch) {
		 return branchService.create(branch);
	}
	
	@PutMapping("/{id}")
	public BranchDto update(@PathVariable("id") int id,@RequestBody Branch branch) {
		return branchService.update(id,branch);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable int id) {
		branchService.delete(id);
	}
}

	

