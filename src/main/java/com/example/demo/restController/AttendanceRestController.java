package com.example.demo.restController;




import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Attendance;
import com.example.demo.service.AttendanceService;

@RestController
public class AttendanceRestController {

	
	@Autowired
	private AttendanceService attendanceService;
	@PostMapping("/takeAttendance")
	public Attendance takeAttendance(@RequestBody Attendance attendance) {
		
		
		
		return attendanceService.saveAttendance(attendance);
	}
	
	@GetMapping("/getUserAttendance/{id}")
	public Attendance readAttendance(@PathVariable Long id) {
		System.out.println("Calling: Read Attendance");
		return attendanceService.readAttendance(id);
	}
	@DeleteMapping("/deleteUserAttendance/{id}")
	public String deleteAttendance(@PathVariable Long id) {
		System.out.println("Calling: delete Admin");
		return attendanceService.deleteAttendance(id);
	}
	@GetMapping("/findAllUserAttendance")
	public List<Attendance> findeAllAttendance() {
		System.out.println("Calling: find User");
		return attendanceService.getAttendance();
	}
	
	
	

}
