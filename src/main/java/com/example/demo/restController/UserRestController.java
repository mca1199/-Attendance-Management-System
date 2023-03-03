package com.example.demo.restController;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;
@RestController
public class UserRestController {

	@Autowired
	private UserService userService;
	
	@PostMapping("/addusers")
	@CrossOrigin(exposedHeaders="Access-Control-Allow-Origin")
	public User addUser(@RequestBody User user) {
		return userService.saveUsers(user);
	}
	
	@GetMapping("/Getusers")
	@CrossOrigin(exposedHeaders="Access-Control-Allow-Origin")
	public List<User>showUsers(){
		return userService.getusers();
	}
	
	@PostMapping("/studentLogin")
	@CrossOrigin(exposedHeaders="Access-Control-Allow-Origin")
	public User loginUser(@RequestBody User user) throws Exception{
		String tempEmail=user.getEmail();
		String tempPassword=user.getPassword();
		User userObj=null;
		if(tempEmail!=null && tempPassword!=null) {
			userObj=userService.fetchByEmailAndPassword(tempEmail, tempPassword);
		}
		if(userObj==null) {
			throw new Exception("Bad Credentials");
		}
		return userObj;
	}
}
