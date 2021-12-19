package com.lal.springbootrestitem.controller;



import java.util.Date;

import com.lal.springbootrestitem.entity.Item;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ItemController {

    
    @GetMapping("/items")
    public Item getItem(){

        Item item = new Item();
        item.setId(1);
        item.setName("Table");
        item.setDescription("Wooden tea table");
        item.setCreated(new Date());
        item.setUpdated(new Date());
        return item;
    }
    
}
