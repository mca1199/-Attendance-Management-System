package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entity.TeacherLogin;
import com.example.demo.repo.TeacherLoginRepo;

@Service
public class TeacherLoginService {

	@Autowired
	public TeacherLoginRepo teacherloginRepo;
	
	public TeacherLogin fetchByEmailAndPassword(String email, String password) {
	return teacherloginRepo.findByEmailAndPassword(email, password);
}
}
