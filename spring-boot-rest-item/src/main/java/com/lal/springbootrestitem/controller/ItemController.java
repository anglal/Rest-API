package com.lal.springbootrestitem.controller;


import java.util.List;

import com.lal.springbootrestitem.entity.Item;
import com.lal.springbootrestitem.service.ItemService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ItemController {
 
 @Autowired  
 ItemService itemService;

    @GetMapping("/items")
    public List<Item> getItems(){
         return itemService.getAllItems();
    }

    @GetMapping("/items/{id}")
    public Item getItem(@PathVariable ("id") int id){
        return itemService.getAnItem(id);
    }
    
}
