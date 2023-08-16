package com.restaurantapp.restaurantproject.service;

import java.util.List;

import com.restaurantapp.restaurantproject.entity.Menu;
import com.restaurantapp.restaurantproject.model.dto.MenuDto;

public interface MenuService {
	
	public List<MenuDto> getAll();
	public MenuDto create(Menu menu);
	public MenuDto update(int id,Menu menu);
	public void delete(int id); 
	
}
