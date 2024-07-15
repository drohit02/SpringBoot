package com.mapping.SocialMedia.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mapping.SocialMedia.custom_exception.NoUserPresentException;
import com.mapping.SocialMedia.custom_exception.UserNotFoundException;
import com.mapping.SocialMedia.custom_exception.UserNotSaveException;
import com.mapping.SocialMedia.models.User;
import com.mapping.SocialMedia.repository.SocialUserRepository;

@Service
public class SocialService {
	
	
	@Autowired
	private SocialUserRepository userRepository;
	
	public List<User> getAllUsers(){
		List<User> users = this.userRepository.findAll();
		if(users.isEmpty())
			throw new NoUserPresentException("User List is empty");
		return users;
	}

	public User savedSocialUser(User user) {	
		User savedUser = this.userRepository.save(user);
		return savedUser;
	}

	public void deleteUser(int socialId) {
		User user = this.userRepository.findById(socialId).orElseThrow(()->new UserNotFoundException("User is not present with given id"));
		this.userRepository.delete(user);
	}

}
