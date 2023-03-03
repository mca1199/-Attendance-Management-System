package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Attendance;

import com.example.demo.repo.AttendanceRepo;



@Service
public class AttendanceService {

@Autowired
	
	private AttendanceRepo attendanceRepo;
	
	public Attendance saveAttendance(Attendance attendance) {
		return attendanceRepo.save(attendance);
	}
	public Attendance readAttendance(Long id) {
		return attendanceRepo.findById(id).orElse(null);
	}
	
	public String deleteAttendance(Long id) {
		attendanceRepo.deleteById(id);
		return "Attendance deleted" +id;
	}
	//get Attendance Details
	public List<Attendance> getAttendance(){
		return attendanceRepo.findAll();
	}
	
	
	
	
	
}
