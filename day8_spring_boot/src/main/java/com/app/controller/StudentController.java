package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.app.dto.ApiResponse;
import com.app.dto.LoginRequestDto;
import com.app.pojo.Student;
import com.app.service.StudentService;

@RestController
@RequestMapping("/students")
@CrossOrigin(origins = "http://localhost:3000")
public class StudentController {

	@Autowired
	private StudentService stdService;
	
	public StudentController()
	{
		System.out.println("inside students studentsController"+getClass());
	}
	
	@GetMapping()
	public List<Student> getAllStudents()
	{
		System.out.println("inside getAllStudents method of studentsController");
		return stdService.getAllStudents();
	}
	
	@PostMapping
	public Student saveStudent(@RequestBody Student std)
	{
		System.out.println("inside saveStudent method of studentsController");
		return stdService.saveStudent(std);
	}
	
	
	
	@PostMapping("/signin")
	public ResponseEntity<?> validateEmployee(@RequestBody LoginRequestDto dto) {
		System.out.println("in emp signin " + dto);
		try {
			return ResponseEntity.ok(stdService.authenticateEmp(dto));
		} catch (RuntimeException e) {
			System.out.println("err in emp controller " + e);
			return ResponseEntity.status(HttpStatus.NOT_FOUND).
					body(new ApiResponse(e.getMessage()));
		}

	}
	
}
