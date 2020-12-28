package com.library.mgmt.reserve.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.library.mgmt.book.model.Books;
import com.library.mgmt.book.repository.BooksRepository;
import com.library.mgmt.book.service.BookService;

@Service
@Transactional
public class ReserveServiceImpl implements ReserveService {

	@Autowired
	private BookService bookService;
	
	@Autowired
	private BooksRepository bookRepository;
	
	@Override
	public String reserveBook(Long bookId) {
	
		Books book = bookService.getBooks(bookId);
		if(book.getAvailableNoOfBooks() > 0) {
			book.setAvailableNoOfBooks(book.getAvailableNoOfBooks() - 1);
			bookRepository.save(book);
			return "Sucessfully reserved the book";
		}
		
		return "Book is not available";
	}

}
