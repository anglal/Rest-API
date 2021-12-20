package com.lal.springbootrestitem.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.lal.springbootrestitem.entity.Item;

import org.springframework.stereotype.Service;

@Service
public class ItemService {
    public static List<Item> items = new ArrayList<>();

    static{
    items.add(new Item(1, "Camera", "Cannon Camera",new Date(), new Date()));
    items.add(new Item(2, "Watch", "Seiko Watch",new Date(), new Date()));
    items.add(new Item(3, "Camera", "Cannon Camera",new Date(), new Date()));
 
    }

    public List<Item> getAllItems(){
        return items;
    }

    public Item getAnItem(int id){
        Item item = null;
        item = items.stream().filter( x -> x.getId() == id).findFirst().get();
        return item;
    }

}
