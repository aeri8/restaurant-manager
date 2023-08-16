package com.restaurantapp.restaurantproject.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;


@Table(name="menus")
@Entity
public class Menu {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="menu_id")
	private int id;
	@Column(name="food_name")
	private String foodName;
	
	@Column(name="price")
	private int menuPrice;
	
	@Column(name="size")
	private String menuSize;
	
	@Column(name="item")
	private int item;
	
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="branch_id")
	private Branch branch;


	public Menu() {
		
	}

	public Menu(int id, String foodName, int menuPrice, String menuSize, int item, Branch branch) {
		super();
		this.id = id;
		this.foodName = foodName;
		this.menuPrice = menuPrice;
		this.menuSize = menuSize;
		this.item = item;
		this.branch = branch;
	}





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
