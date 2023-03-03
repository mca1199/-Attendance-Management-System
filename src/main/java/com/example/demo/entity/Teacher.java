package com.example.demo.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor


@Entity
@Table(name="Teacher")

public class Teacher {
	
	@Id
	@GeneratedValue
	private Long id;
	private Long teacher_id;
	private String email;
	private String password;
	private String userType;
	private Long contact_Number;
	private String name;
	 private String subject_id;
	 private String cource;
	 private String semester;
	 private String address;
	 private String session;
	 
	 
	 public String getSession() {
		return session;
	}
	public void setSession(String session) {
		this.session = session;
	}
	public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
	 
	 public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	 
	 
	 public Long getTeacher_id() {
		return teacher_id;
	}
	public void setTeacher_id(Long teacher_id) {
		this.teacher_id = teacher_id;
	}
	
	
	

	public String getSubject_id() {
		return subject_id;
	}
	public void setSubject_id(String subject_id) {
		this.subject_id = subject_id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	public Long getContact_Number() {
		return contact_Number;
	}
	public void setContact_Number(Long contact_Number) {
		this.contact_Number = contact_Number;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	 
	
	 
	 
	 
	
	 
	 
	
	
	
	 
	 
}
