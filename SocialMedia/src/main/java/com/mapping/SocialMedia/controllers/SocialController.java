package com.mapping.SocialMedia.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mapping.SocialMedia.services.SocialService;

@RestController
@RequestMapping("/api")
public class SocialController {

	@Autowired
	private SocialService dataService;
	
	@GetMapping("/")
	public void getAllUsers() {
		
	}
}
