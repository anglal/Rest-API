package com.aza.bootapirestjpa.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.aza.bootapirestjpa.entity.Item;


@Service
@Transactional
public class ItemServiceImpl implements ItemService {
	
	private List<Item> itemList = new ArrayList<Item>();
	
	public ItemServiceImpl () {
		
//		itemList.add(new Item());
		itemList.add(new Item(2, "Book", "Zipline", new Date()));
		itemList.add(new Item(3, "Bicycle", "Stackline", new Date()));
		itemList.add(new Item(4, "Bicycle", "Stackline", new Date()));
	}

	@Override
	public List<Item> getItemList() {
		return itemList;
	}

	@Override
	public Item getItem(int id) {
		Item item = null;
		item = itemList.stream().filter((itm)-> itm.getId() == id).findFirst().get();
		
		return item;
	}

	@Override
	public Item addItem(Item item) {
		itemList.add(item);
		return item;
	}

	@Override
	public Item updateItem(Item item) {
		int itemId = item.getId();
		
		Iterator<Item> itr = this.itemList.iterator();
		
		while(itr.hasNext()) {
			if(((Item) itr.next()).getId() == itemId) {
				itr.remove();
			}
		}
		this.itemList.add(item);
		
		return item;
	}

	@Override
	public Item deleteItem(int id) {
		Iterator<Item> itrItem = this.itemList.iterator();
		while(itrItem.hasNext()) {
			if(id == itrItem.next().getId()) {
			itrItem.remove();
			}
		}
		return null;
	}
}
