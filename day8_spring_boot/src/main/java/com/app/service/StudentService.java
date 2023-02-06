package com.app.service;

import java.util.List;

import com.app.dto.LoginRequestDto;
import com.app.dto.LoginStudentSpecificResponse;
import com.app.pojo.Student;

public interface StudentService {
	
	List<Student> getAllStudents();
	Student saveStudent(Student std);
	LoginStudentSpecificResponse authenticateEmp(LoginRequestDto dto);
}
