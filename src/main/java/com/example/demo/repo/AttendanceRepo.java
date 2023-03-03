package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Attendance;

@Repository
public interface AttendanceRepo extends JpaRepository<Attendance,Long>{

}
