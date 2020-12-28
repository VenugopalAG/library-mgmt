package com.library.mgmt.book.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.library.mgmt.book.model.Books;
import com.library.mgmt.book.service.BookService;
import com.library.mgmt.shelf.exception.ShelfNotFoundException;

/**
 * 
 * @author venugopal
 *
 */

@RestController
public class BooksController {

	@Autowired
	private BookService bookService;
	
	@PostMapping("/books/{shelfId}")
	public Books addBook(@RequestBody Books books, @PathVariable Long shelfId) throws ShelfNotFoundException {
		System.out.println("Entered add book");
		bookService.addBook(books, shelfId);
		return books;
	}
	
	@GetMapping("/books/{bookId}")
	public Books getBook(@PathVariable Long bookId) {
		
		return bookService.getBooks(bookId);
		
	}
	
}
