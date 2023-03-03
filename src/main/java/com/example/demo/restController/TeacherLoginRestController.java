package com.example.demo.restController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.entity.TeacherLogin;

import com.example.demo.service.TeacherLoginService;

public class TeacherLoginRestController {

	@Autowired
	public TeacherLoginService teacherloginService;
	
	@PostMapping("/teacherLogin")
	@CrossOrigin(exposedHeaders="Access-Control-Allow-Origin")
	public TeacherLogin loginTeacherLogin(@RequestBody TeacherLogin teacherlogin) throws Exception{
		String tempEmail=teacherlogin.getEmail();
		String tempPassword=teacherlogin.getPassword();
		TeacherLogin teacherloginObj=null;
		if(tempEmail!=null && tempPassword!=null) {
			teacherloginObj=teacherloginService.fetchByEmailAndPassword(tempEmail, tempPassword);
		}
		if(teacherloginObj==null) {
			throw new Exception("Bad Credentials");
		}
		return teacherloginObj;
}
}