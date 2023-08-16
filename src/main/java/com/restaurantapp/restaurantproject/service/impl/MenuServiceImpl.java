package com.restaurantapp.restaurantproject.service.impl;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restaurantapp.restaurantproject.entity.Menu;
import com.restaurantapp.restaurantproject.model.dto.MenuDto;
import com.restaurantapp.restaurantproject.repository.MenuRepository;
import com.restaurantapp.restaurantproject.service.MenuService;

@Service
public class MenuServiceImpl implements MenuService {
		@Autowired
		private final MenuRepository menuRepository;
		
		

		public MenuServiceImpl(MenuRepository menuRepository) {
			super();
			this.menuRepository = menuRepository;
			
			
	    }
		
		  public List<MenuDto> getAll() {
		        List<Menu> menuList = menuRepository.findAll();
		        List<MenuDto> menuDtoList = new ArrayList<>();

		        for (Menu menu : menuList) {
		            menuDtoList.add(convert(menu));
		        }

		        return menuDtoList;
		    }


		   

		    private MenuDto convert(Menu menu) {
		        MenuDto menuDto = new MenuDto();
		        menuDto.setId(menu.getId());
		        menuDto.setFoodName(menu.getFoodName());
		        menuDto.setItem(menu.getItem());
		        menuDto.setMenuPrice(menu.getMenuPrice());
		        menuDto.setMenuSize(menu.getMenuSize());
		        return menuDto;
		    }

		    
		    public MenuDto create(Menu menu) {
		        return convert(menuRepository.save(menu));
		    }
		    
		    public MenuDto update(int id, Menu menu) {
				
				Optional<Menu> menuOp=menuRepository.findById(id);
					
				if(menuOp.isPresent()) {
					
					Menu existingMenu=menuOp.get();
					existingMenu.setId(menu.getId());
					existingMenu.setFoodName(menu.getFoodName());
					existingMenu.setItem(menu.getItem());
					existingMenu.setMenuPrice(menu.getMenuPrice());
					existingMenu.setMenuSize(menu.getMenuSize());
					 
					return convert(menuRepository.save(existingMenu));
				}else {
					throw new RuntimeException("Restaurant is not found with id:"+id);
				}
					
			}
			
			public void delete(int id) {
				Optional<Menu> menuOp=menuRepository.findById(id);
				
				if(menuOp.isPresent()) {
					
					menuRepository.delete(menuOp.get());
				}else {
					throw new RuntimeException("Restaurant is not found with id:"+id);
				}
				
			}
}	
