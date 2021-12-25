package com.aza.bootapirestjpa.service;

import java.util.List;

import com.aza.bootapirestjpa.entity.Item;

public interface ItemService {

	List<Item> getItemList();

	Item getItem(int id);

	Item addItem(Item item);

	Item updateItem(Item item);

	Item deleteItem(int id);

}