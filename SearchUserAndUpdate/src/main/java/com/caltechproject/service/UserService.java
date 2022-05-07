package com.caltechproject.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.caltechproject.entity.User;
import com.caltechproject.exception.UserNotFoundException;
import com.caltechproject.repository.UserRepository;



@Service 
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	public Iterable<User> GetAllUsers() {
		return userRepository.findAll();
	}
	
	public User GetUserByName(String name) {
		return userRepository.findByName(name);
		
	}
	
	public User GetUserById(int id) {
		Optional<User> findUser = userRepository.findById(id);
		if(!findUser.isPresent()) throw new UserNotFoundException();
		return findUser.get();
	}
	
	public User UpdateUser(User userToUpdate) {
		return userRepository.save(userToUpdate);
	}
}
