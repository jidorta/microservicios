package com.ibandorta.app.item.models.service;

import java.util.List;

import com.ibandorta.app.item.models.Item;

public interface ItemService {
	
	public List<Item>findAll();
	public Item findByID(Long id,Integer cantidad);

}
