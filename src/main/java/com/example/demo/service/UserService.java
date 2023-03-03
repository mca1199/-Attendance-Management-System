package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.demo.entity.User;
import com.example.demo.repo.UserRepo;

@Service
public class UserService {

	@Autowired
	public UserRepo userRepo;
	
	public User saveUsers(User user) {
		return userRepo.save(user);
	}
	
	public List<User> getusers(){
		return userRepo.findAll();
	}
	public User fetchByEmailAndPassword(String email, String password) {
		return userRepo.findByEmailAndPassword(email, password);
	}
	
	
}
