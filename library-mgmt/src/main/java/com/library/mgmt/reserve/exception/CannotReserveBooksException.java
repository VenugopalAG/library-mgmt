package com.library.mgmt.reserve.exception;

/**
 * 
 * @author venugopal
 *
 */
public class CannotReserveBooksException extends Exception{

	private static final long serialVersionUID = 1L;

	public CannotReserveBooksException(String message) {
		super(message);
	}
}
