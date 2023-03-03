package com.example.demo.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Attendance;
import com.example.demo.entity.Student;
import com.example.demo.entity.StudentAttendance;
//import com.example.demo.entity.User;
import com.example.demo.repo.AttendanceRepo;
import com.example.demo.repo.StudentAttendanceRepo;
import com.example.demo.repo.StudentRepo;




@Service
public class StudentService {

	@Autowired
	private AttendanceRepo attendanceRepo;
	
	
	public Attendance readAttendance(Long id) {
		return attendanceRepo.findById(id).orElse(null);
	}

@Autowired
private StudentRepo studentRepo;

	public Student saveStudents(Student student) {
		
		return studentRepo.save(student);
	}

	public List<Student> getStudents(){
		return studentRepo.findAll();
	}
	@Autowired
	private StudentAttendanceRepo studentattendanceRepo;
	
	 public StudentAttendance saveStudentAttendance(StudentAttendance studentattendance) {
		 
		 return studentattendanceRepo.save(studentattendance);
	 }

	 public List<StudentAttendance> getStudentAttendance(){
		 return studentattendanceRepo.findAll();
	 }
}
