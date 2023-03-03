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
@Table(name="Attendance_Details")

public class Attendance {

	@Id
	
	@GeneratedValue
   	 private Long id; 
	 private String name;
	 private String session;
	 private String cource; 
	 private String semester; 
	 private String date; 
	 private String time; 
	 private String subject_Id; 
	 private String status; 
	 private String takeAttendance;
	 
	 
	
	public String getTakeAttendance() {
		return takeAttendance;
	}
	public void setTakeAttendance(String takeAttendance) {
		this.takeAttendance = takeAttendance;
	}
	public Long getId() {
			return id;
		}
		public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
		public void setId(Long id) {
			this.id = id;
		}
	
	
	
	public String getSession() {
		return session;
	}
	public void setSession(String session) {
		this.session = session;
	}
	public String getSubject_Id() {
		return subject_Id;
	}
	public void setSubject_Id(String subject_Id) {
		this.subject_Id = subject_Id;
	}
	
	 
	 
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getCource() {
		return cource;
	}
	public void setCource(String cource) {
		this.cource = cource;
	}
	public String getSemester() {
		return semester;
	}
	public void setSemester(String semester) {
		this.semester = semester;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	 
	
	
	 
	 
}
