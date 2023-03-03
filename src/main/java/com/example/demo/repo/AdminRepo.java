package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Admin;

@Repository

public interface AdminRepo extends JpaRepository<Admin, String>{
	public Admin findByEmailAndPassword(String email, String Password);

}
