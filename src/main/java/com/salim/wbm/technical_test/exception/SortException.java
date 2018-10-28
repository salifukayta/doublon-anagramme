package com.salim.wbm.technical_test.exception;

/**
 * Exception thrown while sorting
 * 
 * @author safeki
 */
public class SortException extends Exception {
	
	private static final long serialVersionUID = 1L;

	/**
	 * The error
	 */
	private String message;

	/**
	 * Constructor
	 * 
	 * @param msg
	 */
	public SortException(String msg) {
		this.message = msg;
	}
	
	/**
	 * Constructor
	 * 
	 * @param e
	 */
	public SortException(Exception e) {
		this.message = e.toString();
	}

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

}
