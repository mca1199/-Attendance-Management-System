package com.example.demo.restController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Attendance;
import com.example.demo.entity.Student;
import com.example.demo.entity.Teacher;
import com.example.demo.entity.TeacherLogin;
import com.example.demo.repo.AttendanceRepo;
import com.example.demo.repo.TeacherLoginRepo;

//import com.example.demo.entity.Teacher;
//import com.example.demo.entity.User;
//import com.example.demo.repo.UserRepo;
//import com.example.demo.entity.Teacher;
import com.example.demo.service.TeacherService;

@RestController
public class TeacherRestController {

	@Autowired
	private TeacherService teacherService;
	@Autowired
	private TeacherLoginRepo teacherLoginRepo;
	@Autowired
	private AttendanceRepo attendanceRepo;
	
	@PostMapping("/addTeacher")
	@CrossOrigin(exposedHeaders="Access-Control-Allow-Origin")
	public Teacher addTeacher(@RequestBody Teacher teacher) {
		System.out.println("Calling: save Teacher");
		Teacher savedTeacher=teacherService.saveTeachers(teacher);
		TeacherLogin teacherLogin=new TeacherLogin();
		teacherLogin.setName(savedTeacher.getName());
		teacherLogin.setContact_Number(savedTeacher.getContact_Number());
		teacherLogin.setEmail(savedTeacher.getEmail());
		teacherLogin.setPassword(savedTeacher.getPassword());
		teacherLogin.setUserType("Teacher");
		teacherLoginRepo.save(teacherLogin);
		return teacherService.saveTeachers(teacher);	
	}
	@GetMapping("/GetTeacher")
	@CrossOrigin(exposedHeaders="Access-Control-Allow-Origin")
	public List<Teacher>showTeachers(){
		return teacherService.getTeachers();
	}
	
	@DeleteMapping("/deletestudent/{id}")
	public String deletestudent(@PathVariable Long id) {
		System.out.println("Calling: delete Student");
		return teacherService.deleteStudent(id);
	}
	@GetMapping("/findAllStudent")
	public List<Student> findeAllStudent() {
		System.out.println("Calling: find Teacher");
		return teacherService.getStudent();
	}
	
	
	
	@PutMapping("/teacherupdateStudent/{id}")
	@CrossOrigin(exposedHeaders="Access-Control-Allow-Origin")
	public Student updateStudents(@RequestBody Student student) {
		return teacherService.updateStudents(student);
	}
	
	@PutMapping("/teacherupdateAttendance/{id}")
	@CrossOrigin(exposedHeaders="Access-Control-Allow-Origin")
	public Attendance updateAttendances(@RequestBody Attendance attendance) {
		attendance.setTakeAttendance("Present");
		attendanceRepo.save(attendance);
		return teacherService.updateAttendance(attendance);
		

	}
	
}

