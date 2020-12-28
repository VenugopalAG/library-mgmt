package com.library.mgmt.shelf.service;

import java.util.List;

import com.library.mgmt.shelf.model.Shelf;


public interface ShelfService {

	public Shelf addShelf(Shelf shelf);
		
	public Shelf deleteShelf();
	
	public List<Shelf>  listAllShelf();
	
}
