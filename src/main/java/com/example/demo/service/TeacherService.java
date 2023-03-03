package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Attendance;
import com.example.demo.entity.Student;
import com.example.demo.entity.Teacher;
import com.example.demo.repo.AttendanceRepo;
//import com.example.demo.entity.Teacher;
import com.example.demo.repo.StudentRepo;
import com.example.demo.repo.TeacherRepo;
//import com.example.demo.repo.TeacherRepo;

@Service
public class TeacherService {

	@Autowired

	private TeacherRepo teacherRepo;
	
	public Teacher saveTeachers(Teacher teacher) {
		return teacherRepo.save(teacher);
	}
	
	public List<Teacher> getTeachers(){
		return teacherRepo.findAll();
	}

	@Autowired
	private StudentRepo studentRepo;
	 
	public Student saveStudent(Student student) {
		return studentRepo.save(student);
	}
	
	public Student readStudent(Long id) {
		return studentRepo.findById(id).orElse(null);
	}
	
	public String deleteStudent(Long id) {
		studentRepo.deleteById(id);
		return "Student deleted "+id;	
		}
	
	public List<Student> getStudent(){
		return studentRepo.findAll();
	}
	public Student updateStudents(Student student) {
		Student exisitingStudent=studentRepo.findById(student.getId()).orElse(null);
		
		exisitingStudent.setP_Name(student.getP_Name());
		exisitingStudent.setGender(student.getGender());
		exisitingStudent.setAddress(student.getAddress());
//		exisitingStudent.setContact_Number(student.getContact_Number());
		exisitingStudent.setCource(student.getCource());
		exisitingStudent.setDob(student.getDob());
		exisitingStudent.setRoll_No(student.getRoll_No());
		exisitingStudent.setSemester(student.getSemester());
		exisitingStudent.setSession(student.getSession());
		return studentRepo.save(exisitingStudent);
		
	}
	
	
	@Autowired
	private AttendanceRepo attendanceRepo;
	
	public Attendance saveAttendance(Attendance attendance) {
		return attendanceRepo.save(attendance);
		
	}
	public List<Attendance>getAttendance(){
		return attendanceRepo.findAll();
				
	}
	public Attendance updateAttendance(Attendance attendance) {
		Attendance existingAttendance=attendanceRepo.findById(attendance.getId()).orElse(null);
		existingAttendance.setSession(attendance.getSession());
		existingAttendance.setSubject_Id(attendance.getSubject_Id());
		return attendanceRepo.save(existingAttendance);
	}
	}
