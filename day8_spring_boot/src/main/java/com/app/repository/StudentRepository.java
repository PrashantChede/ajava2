package com.app.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.pojo.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

	
	Optional<Student> findByEmailAndPassword(String em, String pass);
	
	
}
