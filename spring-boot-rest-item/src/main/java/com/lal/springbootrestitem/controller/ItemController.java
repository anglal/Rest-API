package com.lal.springbootrestitem.controller;


import java.util.List;

import com.lal.springbootrestitem.entity.Item;
import com.lal.springbootrestitem.service.ItemService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ItemController {
 
 @Autowired  
 private ItemService itemService;

    @GetMapping({"/","/items"})
    public List<Item> getItems(){
         return itemService.getAllItems();
    }

    @GetMapping("/items/{id}")
    public Item getItem(@PathVariable ("id") int id){
        return itemService.getAnItem(id);
    }
    
    @PostMapping("/addItem")
    public Item addItem(@RequestBody Item item)
    {
        return itemService.addItem(item);
    }

    @DeleteMapping("/items/{itemId}")
    public void deleteItem(@PathVariable("itemId") int id){
        itemService.deleteItem(id);
    }

    @PutMapping("/items/{itemId}")
    public Item updateItem(@RequestBody Item item, @PathVariable("itemId") int bookId){
        itemService.updateItem(item, bookId);
        return item;
    }


}
