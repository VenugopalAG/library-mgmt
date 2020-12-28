package com.library.mgmt.book.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.library.mgmt.book.model.Books;
import com.library.mgmt.book.repository.BooksRepository;
import com.library.mgmt.shelf.exception.ShelfNotFoundException;
import com.library.mgmt.shelf.model.Shelf;
import com.library.mgmt.shelf.repository.ShelfRepository;

/**
 * 
 * @author venugopal
 *
 */
@Service
@Transactional
public class BookServiceImpl  implements BookService{

	@Autowired
	BooksRepository bookRepository;
	
	@Autowired
	ShelfRepository shelfRepository;

	@Override
	public Books addBook(Books books, Long shelfId) throws ShelfNotFoundException{
		Optional<Shelf> sh = shelfRepository.findById(shelfId);
		
		if(sh.isPresent()) {
			books.setShelf(sh.get());
		}
		else {
			System.out.println("Shelf id does not exsists : " +shelfId);
			throw new ShelfNotFoundException("Shelf Number does not exists");
		}
		bookRepository.save(books);
		return books;
	}

	@Override
	public Books deleteBook(Long bookId) {
		return null;
	}

	@Override
	public Books updateBook(Books books) {
		return null;
	}

	@Override
	public Books getBooks(Long param) {
		Optional<Books> book = bookRepository.findById(param);
		if(book.isPresent()) {
			
			int no_of_books = book.get().getNoOfBooks(); 
			if(no_of_books > 0) {
				book.get().setAvailableNoOfBooks(--no_of_books);
				return book.get();
			}
		}
		return null;
	}





}
