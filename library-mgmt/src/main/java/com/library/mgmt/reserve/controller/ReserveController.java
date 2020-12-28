package com.library.mgmt.reserve.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.library.mgmt.reserve.service.ReserveService;

@RestController
public class ReserveController {

	@Autowired
	private ReserveService reserveService;
	
	@PostMapping("/reserve/{bookId}")
	public String reserveBook(@PathVariable Long bookId) {
		return reserveService.reserveBook(bookId);
		
	}
}
