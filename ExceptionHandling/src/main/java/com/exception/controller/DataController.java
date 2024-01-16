package com.exception.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataController {

	
	@GetMapping("/exception")
	public void exceptionFound() throws NullPointerException,Exception
	{
		throw new Exception();
	}
}
