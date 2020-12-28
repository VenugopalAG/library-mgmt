package com.library.mgmt.shelf.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.library.mgmt.shelf.model.Shelf;
import com.library.mgmt.shelf.service.ShelfService;
/**
 * 
 * @author venugopal
 *
 */
@RestController
public class ShelfController {

	@Autowired
	private ShelfService shelfService;
	
	@PostMapping("/shelf")
	public Shelf addShelf(@RequestBody Shelf shelf) {
	
		shelfService.addShelf(shelf);
		return shelf;
	}
	
	@GetMapping("/shelf")
	public List<Shelf> listAllShelf() {
		return shelfService.listAllShelf();
	}
	
	
}
