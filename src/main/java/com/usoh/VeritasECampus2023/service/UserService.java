package com.usoh.VeritasECampus2023.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.usoh.VeritasECampus2023.model.User;
import com.usoh.VeritasECampus2023.repository.UserRepo;

@Service
public class UserService {
	@Autowired
	private UserRepo repo;
	
	public List<User> getAllUsers() {
		return repo.findAll();
	}
	
	public void deleteUser(Long id) {
		repo.deleteById(id);
	}
	
	public User createUser(User user) {
		User newuser=user;
		newuser.setActive(false);
		newuser.setBlocked(false);
		//newuser.setLname(null);
		
		return repo.save(newuser);
	}
	
	public User updateUser(Long id) {
		User newuser=new User();
		newuser.setActive(false);
		newuser.setBlocked(false);
		//newuser.setLname(null);
		
		return repo.save(newuser);
	}

}
