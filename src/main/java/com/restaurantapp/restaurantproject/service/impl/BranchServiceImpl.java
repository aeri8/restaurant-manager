package com.restaurantapp.restaurantproject.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restaurantapp.restaurantproject.entity.Branch;
import com.restaurantapp.restaurantproject.entity.Restaurant;
import com.restaurantapp.restaurantproject.model.dto.BranchDto;
import com.restaurantapp.restaurantproject.repository.BranchRepository;
import com.restaurantapp.restaurantproject.service.BranchService;


@Service
public class BranchServiceImpl implements BranchService {
	
	@Autowired
	private final BranchRepository branchRepository;
	
	public BranchServiceImpl(BranchRepository branchRepository) {
		super();
		this.branchRepository = branchRepository;
		
	}
	


	  public List<BranchDto> getAll(){
	    	
	    	List<Branch>branchList= branchRepository.findAll();
	    	List<BranchDto>branchDtoList= new ArrayList<BranchDto>();
		
	    	for(Branch branch :branchList) {
				branchDtoList.add(convert(branch));
			}
	    	
			return branchDtoList;
		
	    }
	  
	  
	  
	  public List<BranchDto> findByRestaurantId(int id){
		  List<Branch>branchs= branchRepository.findByRestaurantId(id);
		  List<BranchDto>branchDto= new ArrayList<BranchDto>();
	    	
	    	for(Branch branch :branchs) {
				branchDto.add(convert(branch));
			}
		  return branchDto;
	  }
	  	
	  	
	  	
	   private BranchDto convert(Branch branch) {
			
			BranchDto branchDto=new BranchDto();
			
			branchDto.setId(branch.getId());
			branchDto.setBranchAddress(branch.getBranchAddress());
			branchDto.setPhoneNumber(branch.getPhoneNumber());
			
			Restaurant restaurant = branch.getRestaurant();
		    if (restaurant != null) {
		        branchDto.setRestaurantId(restaurant.getId());
		    	//branchDto.setRestaurantId(branch.getRestaurant().getId());
		    }
		    
			
			return branchDto;
		}
	   
	  
		 
		public BranchDto create(Branch branch) {
			 return convert(branchRepository.save(branch));
		}
		 
	
		public BranchDto update(int id, Branch branch) {
			
			Optional<Branch> branchOp=branchRepository.findById(id);
				
			if(branchOp.isPresent()) {
				
				Branch existingBranch=branchOp.get();
				existingBranch.setBranchAddress(branch.getBranchAddress());
				existingBranch.setPhoneNumber(branch.getPhoneNumber());
				
				return convert(branchRepository.save(existingBranch));
			}else {
				throw new RuntimeException("Branch is not found with id:"+id);
			}
				
		}
		
		public void delete(int id) {
			Optional<Branch> branchOp=branchRepository.findById(id);
			
			if(branchOp.isPresent()) {
				
				 branchRepository.delete(branchOp.get());
			}else {
				throw new RuntimeException("Branch is not found with id:"+id);
			}
			
		}
		
		
		
		
		
}  
