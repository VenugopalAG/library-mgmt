package com.library.mgmt.book.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.library.mgmt.book.model.Books;


public interface BooksRepository extends JpaRepository<Books,Long>{

	
}
