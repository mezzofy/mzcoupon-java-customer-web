package com.mezzofy.coupon.exception;

import org.apache.commons.lang.exception.NestableException;

public class SessionExpiredException extends NestableException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	public SessionExpiredException() {
		super();
	}

	/**
	 * @param arg0
	 */
	public SessionExpiredException(String arg0) {
		super(arg0);
	}

	/**
	 * @param arg0
	 */
	public SessionExpiredException(Throwable arg0) {
		super(arg0);
	}

	/**
	 * @param arg0
	 * @param arg1
	 */
	public SessionExpiredException(String arg0, Throwable arg1) {
		super(arg0, arg1);
	}

}
