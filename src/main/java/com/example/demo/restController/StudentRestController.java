package com.example.demo.restController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Attendance;
import com.example.demo.entity.Student;
import com.example.demo.entity.StudentAttendance;
import com.example.demo.entity.User;
import com.example.demo.repo.StudentAttendanceRepo;
import com.example.demo.repo.UserRepo;
import com.example.demo.service.StudentAttendanceService;
import com.example.demo.service.StudentService;

@RestController
public class StudentRestController {

	@Autowired
	private StudentService studentService;
	@Autowired
	private UserRepo userRepo;
	@Autowired
	private StudentAttendanceService studentattendanceService;
	
	
	@GetMapping("/viewattendance/{id}")
	public Attendance readAttendance(@PathVariable Long id) {
		System.out.println("Calling: Read Student");
		return studentService.readAttendance(id);
		
		
	}
	@PostMapping("/addstudent")
	@CrossOrigin(exposedHeaders="Access-Control-Allow-Origin")
	public Student addStudent(@RequestBody Student student) {
		
		Student savedStudent= studentService.saveStudents(student);
		User user=new User();
		
		user.setName(savedStudent.getName());
		user.setEmail(savedStudent.getEmail());
		user.setContact_Number(savedStudent.getContact_Number());
		user.setPassword(savedStudent.getPassword());
		user.setUserType("Student");
		userRepo.save(user);
		return studentService.saveStudents(student);
		
	}
	
	@GetMapping("/Getstudent")
	@CrossOrigin(exposedHeaders="Access-Control-Allow-Origin")
	public List<Student>showStudents(){
		return studentService.getStudents();
	}
	
	@PostMapping("/addstudentAtendace")
	@CrossOrigin(exposedHeaders="Access-Control-Allow-Origin")
	public StudentAttendance addStudentAtendace(@RequestBody StudentAttendance studentattendace) {
		studentattendace.setMarkattendanc("Present");
		return studentService.saveStudentAttendance(studentattendace);
		
	}
	@GetMapping("getstudentAttendance")
	@CrossOrigin(exposedHeaders="Access-Control-Allow-Origin")
	public List<StudentAttendance>showStudentAttendance(){
		return studentService.getStudentAttendance();
	}
	
	
}
