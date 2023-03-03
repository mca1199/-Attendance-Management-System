package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Attendance;
import com.example.demo.entity.Student;
import com.example.demo.entity.Teacher;

import com.example.demo.repo.AttendanceRepo;
import com.example.demo.repo.StudentRepo;
import com.example.demo.repo.TeacherRepo;

@Service
public class AdminService {

	@Autowired
private TeacherRepo teacherRepo;
	
	public Teacher saveTeachers(Teacher teacher) {
		return teacherRepo.save(teacher);
	}
	
	public String deleteTeacher(Long id) {
		teacherRepo.deleteById(id);
		return "Teacher deleted" +id;
	}
	
	public List<Teacher> getTeacher(){
		return teacherRepo.findAll();
	}
	
	public Teacher updateTeachers(Teacher teacher) {
		Teacher exisitingTeacher=teacherRepo.findById(teacher.getId()).orElse(null);
		exisitingTeacher.setAddress(teacher.getAddress());
		exisitingTeacher.setCource(teacher.getCource());
		exisitingTeacher.setSubject_id(teacher.getSubject_id());
		exisitingTeacher.setTeacher_id(teacher.getTeacher_id());
		exisitingTeacher.setSemester(teacher.getSemester());
		exisitingTeacher.setSession(teacher.getSession());
		return teacherRepo.save(exisitingTeacher);
		
	}
	
	
	
	
	@Autowired
	private StudentRepo studentRepo;
	 
	public Student saveStudents(Student student) {
		return studentRepo.save(student);
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
		exisitingStudent.setCource(student.getCource());
		exisitingStudent.setDob(student.getDob());
		exisitingStudent.setRoll_No(student.getRoll_No());
		exisitingStudent.setSemester(student.getSemester());
		exisitingStudent.setSession(student.getSession());
		return studentRepo.save(exisitingStudent);
		
	}
	
	@Autowired
	private AttendanceRepo attendanceRepo;
	
	public List<Attendance> getAttendance(){
		return attendanceRepo.findAll();
		
	}
	public Attendance saveAttendance(Attendance attendance) {
		return attendanceRepo.save(attendance);
	}


	
}
