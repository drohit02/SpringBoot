package com.mapping.SocialMedia.custom_exception;

public class UserNotFoundException extends RuntimeException{
	
	public UserNotFoundException() {
		super();
	}
	
	public UserNotFoundException(String msg){
		super(msg);
	}

}
