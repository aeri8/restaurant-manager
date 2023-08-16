package com.restaurantapp.restaurantproject.model.dto;

import com.restaurantapp.restaurantproject.entity.Branch;

public class MenuDto {

	private int id;

	private String foodName;
	
	
	private int menuPrice;
	
	
	private String menuSize;
	
	
	private int item;
	

	private Branch branch;


	


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getFoodName() {
		return foodName;
	}


	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}


	public int getMenuPrice() {
		return menuPrice;
	}


	public void setMenuPrice(int menuPrice) {
		this.menuPrice = menuPrice;
	}


	public String getMenuSize() {
		return menuSize;
	}


	public void setMenuSize(String menuSize) {
		this.menuSize = menuSize;
	}


	public int getItem() {
		return item;
	}


	public void setItem(int item) {
		this.item = item;
	}


	public Branch getBranch() {
		return branch;
	}


	public void setBranch(Branch branch) {
		this.branch = branch;
	}


	


	
	
}
