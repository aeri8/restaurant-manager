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

import com.restaurantapp.restaurantproject.entity.Menu;
import com.restaurantapp.restaurantproject.model.dto.MenuDto;
import com.restaurantapp.restaurantproject.service.MenuService;

@RestController
@RequestMapping("/api/menu")
public class MenuController {


	private final MenuService menuService;

	public MenuController(MenuService menuService) {
	super();
	this.menuService = menuService;
	}	
		
	
	
	@GetMapping
	public List<MenuDto> findAll(){
		return menuService.getAll();
	}	
	
	 
	@PostMapping
	public MenuDto create(@RequestBody Menu menu){
	
		return menuService.create(menu);
		
	}
	
	@PutMapping("/{id}")
	public MenuDto update(@PathVariable int id,@RequestBody Menu menu) {
		return menuService.update(id,menu);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable int id) {
		menuService.delete(id);
	}	
}
