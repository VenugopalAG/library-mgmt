package com.library.mgmt.book.service;

import com.library.mgmt.book.model.Books;
import com.library.mgmt.shelf.exception.ShelfNotFoundException;
/**
 * 
 * @author venugopal
 *
 */
public interface BookService {

	public Books addBook(Books books, Long shelfId) throws ShelfNotFoundException;
	
	public Books deleteBook(Long bookId);
	
	public Books updateBook(Books books);
	
	public Books getBooks(Long param);
	
	
}
