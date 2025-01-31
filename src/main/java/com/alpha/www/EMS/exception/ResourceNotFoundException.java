package com.alpha.www.EMS.exception;

public class ResourceNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3649159790150284606L;

	public ResourceNotFoundException(String message) {
		super(message);
	}
}
