package com.library.mgmt.book.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.library.mgmt.shelf.model.Shelf;
/**
 * 
 * @author venugopal
 *
 */
@Entity
public class Books implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id  
	@GeneratedValue(strategy = GenerationType.AUTO)  
	private Long id;  
	
	@Column  
	private String title;  
	
	@Column  
	private String author;  
	
	@Column  
	private String subject;
	
	@Column  
	private String category;
	
	@Column
	private String publicationDate;

	@Column
	private int noOfBooks;
	
	@Column
	private int availableNoOfBooks;
	
	@Transient
	private Integer shelfNumber;
	
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "shelf_id", nullable = false)
	@JsonIgnore
    private Shelf shelf;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getPublicationDate() {
		return publicationDate;
	}

	public void setPublicationDate(String publicationDate) {
		this.publicationDate = publicationDate;
	}

	public Integer getShelfNumber() {
		return shelfNumber;
	}

	public void setShelfNumber(Integer shelfNumber) {
		this.shelfNumber = shelfNumber;
	}

	public Shelf getShelf() {
		return shelf;
	}

	public void setShelf(Shelf shelf) {
		this.shelf = shelf;
	}

	public int getNoOfBooks() {
		return noOfBooks;
	}

	public void setNoOfBooks(int noOfBooks) {
		this.noOfBooks = noOfBooks;
	}

	public int getAvailableNoOfBooks() {
		return availableNoOfBooks;
	}

	public void setAvailableNoOfBooks(int availableNoOfBooks) {
		this.availableNoOfBooks = availableNoOfBooks;
	}
		
}
