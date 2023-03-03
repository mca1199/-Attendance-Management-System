package com.example.demo.restController;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Admin;
import com.example.demo.entity.Attendance;
import com.example.demo.entity.Student;
import com.example.demo.entity.Teacher;
import com.example.demo.repo.AdminRepo;
import com.example.demo.service.AdminService;
import com.example.demo.service.AttendanceService;

@RestController
public class AdminRestController {

	@Autowired
	private AdminService adminService;
	
	@Autowired
	private AttendanceService attendanceService;
	
	@DeleteMapping("/dltTeacher/{id}")
	@CrossOrigin(exposedHeaders="Access-Control-Allow-Origin")
	public String deleteteacher(@PathVariable Long id) {
		System.out.println("Calling: delete Teacher");
		return adminService.deleteTeacher(id);
	}

	
	@DeleteMapping("/dltStudent/{id}")
	@CrossOrigin(exposedHeaders="Access-Control-Allow-Origin")
	public String deletestudent(@PathVariable Long id) {
		System.out.println("Calling: delete Student");
		return adminService.deleteStudent(id);
	}
	
	
	@PutMapping("/updateStudent/{id}")
	@CrossOrigin(exposedHeaders="Access-Control-Allow-Origin")
	public Student updateStudents(@RequestBody Student student) {
		return adminService.updateStudents(student);
	}
	@PutMapping("/updateTeacher/{id}")
	@CrossOrigin(exposedHeaders="Access-Control-Allow-Origin")
	public Teacher updateTeachers(@RequestBody Teacher teacher) {
		return adminService.updateTeachers(teacher);
	}
	
	@PostMapping("/addAttendancebyAdmin")
	@CrossOrigin(exposedHeaders="Access-Control-Allow-Origin")
	public Attendance addAttendancebyAdmin(@RequestBody Attendance attendance) {
		attendance.setStatus("Present");
		
		return attendanceService.saveAttendance(attendance);	
	}
	@GetMapping("/displayattemdance")
	@CrossOrigin(exposedHeaders="Access-Control-Allow-Origin")
	public List<Attendance>findAllAttendance(){
		return adminService.getAttendance();
	}
	@Autowired
	AdminRepo adminRepo;
	@PostMapping("/AdminLogin")
	@CrossOrigin(exposedHeaders="Access-Control-Allow-Origin")
	public Admin LoginAdmin(@RequestBody Admin admin) throws Exception{
		
		Admin tempAdmin=new Admin();
		tempAdmin.setEmail("admin@gmail.com");
		tempAdmin.setPassword("admin");
		tempAdmin.setName("Admin");
		adminRepo.save(tempAdmin);
		
		String tempEmail=admin.getEmail();
		String tempPassword=admin.getPassword();
		Admin adminLogin=null;
		if(tempEmail!=null && tempPassword!=null) {
			adminLogin=adminRepo.findByEmailAndPassword(tempEmail, tempPassword);
			
		}
		if(adminLogin==null) {
			throw new Exception("Bad Credentials");
		}
		return adminLogin;
	}
}
