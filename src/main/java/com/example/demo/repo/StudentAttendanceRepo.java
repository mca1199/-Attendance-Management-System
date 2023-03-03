package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.StudentAttendance;

@Repository
public interface StudentAttendanceRepo extends JpaRepository <StudentAttendance, Long>{

}
