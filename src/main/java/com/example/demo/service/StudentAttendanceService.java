package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repo.StudentAttendanceRepo;

@Service
public class StudentAttendanceService {
	
	@Autowired
	private StudentAttendanceRepo studentattendanceRepo;

}
