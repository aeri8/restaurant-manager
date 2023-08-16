package com.restaurantapp.restaurantproject.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Table(name="branch")
@Entity
public class Branch {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int id;
	
	@Column(name="branch_address")
	private String branchAddress;
	
	@Column(name="phone_number")
	private String phoneNumber;
	
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="restaurant_id")
	private Restaurant restaurant;
	
	
	@OneToMany(fetch=FetchType.LAZY,mappedBy="branch")
	private List<Menu> menu;

	
	public Branch(int id, String branchAddress, String phoneNumber, Restaurant restaurant,List<Menu> menu) {
		super();
		this.id = id;
		this.branchAddress = branchAddress;
		this.phoneNumber = phoneNumber;
		this.restaurant = restaurant;
		this.menu = menu;
	}
	
	public Branch() {
		
	}

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getBranchAddress() {
		return branchAddress;
	}


	public void setBranchAddress(String branchAddress) {
		this.branchAddress = branchAddress;
	}


	public String getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	public Restaurant getRestaurant() {
		return restaurant;
	}


	public void setRestaurant(Restaurant restaurant) {
		this.restaurant = restaurant;
	}


	public List<Menu> getMenu() {
		return menu;
	}


	public void setMenu(List<Menu> menu) {
		this.menu = menu;
	}


	




	


	
}
