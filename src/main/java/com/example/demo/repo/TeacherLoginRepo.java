package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.TeacherLogin;

@Repository
public interface TeacherLoginRepo extends JpaRepository<TeacherLogin ,Long> {
	
	public TeacherLogin findByEmailAndPassword(String email,String password);
}
 