package com.restaurantapp.restaurantproject.model.dto;

import java.util.List;

public class RestaurantDto {

	private int id;
    private String name;
    private String address;
    private String phoneNumber;
    
    
    private List<BranchDto> branchs;
    
    
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public List<BranchDto> getBranchs() {
		return branchs;
	}

	public void setBranchs(List<BranchDto> branchs) {
		this.branchs = branchs;
	}

	

	
	
}
