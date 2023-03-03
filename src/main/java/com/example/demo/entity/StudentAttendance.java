package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor


@Entity
@Table(name="Student_Attendance")

public class StudentAttendance {

	@Id
	
	@GeneratedValue
   	 private Long id; 
	 private Long attendanceID; 
	 private Long studentId; 
	
	 private String markattendanc; 
	 
	 
	 
	
	public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public Long getAttendanceID() {
			return attendanceID;
		}
		public void setAttendanceID(Long attendanceID) {
			this.attendanceID = attendanceID;
		}
		public Long getStudentId() {
			return studentId;
		}
		public void setStudentId(Long studentId) {
			this.studentId = studentId;
		}
		public String getMarkattendanc() {
			return markattendanc;
		}
		public void setMarkattendanc(String markattendanc) {
			this.markattendanc = markattendanc;
		}
		
	 
	 
	
	
	 
	 
}
