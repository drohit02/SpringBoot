package com.mapping.SocialMedia.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mapping.SocialMedia.models.User;
import com.mapping.SocialMedia.services.SocialService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/social")
public class SocialController {

	@Autowired
	private SocialService dataService;
	
	@GetMapping("/users")
	public ResponseEntity<List<User>> getAllUsers() {
		
		List<User> users = this.dataService.getAllUsers();
		return new ResponseEntity<>(users,HttpStatus.OK);	
	}
	
	@PostMapping("/user")
	public ResponseEntity<User> createSocialUser(@Valid @RequestBody User user) {
		User savedUser = this.dataService.savedSocialUser(user);
		return new ResponseEntity<>(savedUser,HttpStatus.OK);
	}
	
	@DeleteMapping("/user/{socialId}")
	public ResponseEntity<String> deleteUserUsingId(@PathVariable int socialId) {
		this.dataService.deleteUser(socialId);
		return new ResponseEntity<>("user data successfully removed",HttpStatus.OK);
	}
}
