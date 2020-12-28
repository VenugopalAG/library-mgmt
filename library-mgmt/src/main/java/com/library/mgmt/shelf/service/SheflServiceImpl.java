package com.library.mgmt.shelf.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.library.mgmt.shelf.model.Shelf;
import com.library.mgmt.shelf.repository.ShelfRepository;

@Service
@Transactional
public class SheflServiceImpl implements ShelfService{

	@Autowired
	private ShelfRepository shelfRepository;
	
	@Override
	public Shelf addShelf(Shelf shelf) {
		shelfRepository.save(shelf);
		return null;
	}

	@Override
	public Shelf deleteShelf() {
		return null;
	}

	@Override
	public List<Shelf> listAllShelf() {
		return shelfRepository.findAll();
	}
}
