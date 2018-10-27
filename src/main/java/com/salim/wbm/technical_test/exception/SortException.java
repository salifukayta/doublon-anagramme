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
	private String msg;

	/**
	 * Constructor
	 * 
	 * @param msg
	 */
	public SortException(String msg) {
		this.msg = msg;
	}
	
	/**
	 * Constructor
	 * 
	 * @param e
	 */
	public SortException(Exception e) {
		this.msg = e.getMessage();
	}

	/**
	 * @return the msg
	 */
	public String getMsg() {
		return msg;
	}

}
