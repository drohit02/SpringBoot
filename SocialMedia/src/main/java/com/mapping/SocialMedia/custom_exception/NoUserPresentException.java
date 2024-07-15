package com.mapping.SocialMedia.custom_exception;

public class NoUserPresentException extends RuntimeException{
	
	public NoUserPresentException() {
		super();
	}
	
	public NoUserPresentException(String msg) {
		super(msg);
	}

}
