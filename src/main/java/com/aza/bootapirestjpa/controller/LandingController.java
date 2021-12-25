package com.aza.bootapirestjpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.aza.bootapirestjpa.entity.Item;
import com.aza.bootapirestjpa.service.ItemService;

// Controller for Rest API
@RestController
public class LandingController {
	
	// Create an object	
	@Autowired
	private ItemService itemService;
	
	// Get all items
	@GetMapping("/items")
	public List<Item> getItems() {;
		return itemService.getItemList();
	}
	
	// Get specific item	
	@GetMapping("/items/{itemId}")
	public Item getItem(@PathVariable ("itemId") int itemId) {
		return itemService.getItem(itemId);
		
	}
	
	// Add an item
	@PostMapping("/items")
	public Item addItem(@RequestBody Item item) {
		return this.itemService.addItem(item);
	}
	
	// Update an item
	@PutMapping("/items/{itemId}")
	public Item updateItem(@RequestBody Item item) {
		Item itm = itemService.updateItem(item);
		return itm;
	}
	
	// Delete an item

	@DeleteMapping("items/{itemId}")
	public Item deleteItem(@PathVariable("itemId") int id) {
		return this.itemService.deleteItem(id);
	}
}
