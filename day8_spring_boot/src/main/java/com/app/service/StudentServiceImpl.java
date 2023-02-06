package com.app.service;

import java.util.List;

import org.modelmapper.ModelMapper;

//import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.custom_exceptions.ResourceNotFoundException;
import com.app.dto.LoginRequestDto;
import com.app.dto.LoginStudentSpecificResponse;
import com.app.pojo.Student;
import com.app.repository.StudentRepository;



@Service
@Transactional
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository stdRepo;
	
	@Autowired
	private ModelMapper mapper;
	
	
	@Override
	public List<Student> getAllStudents() {
		System.out.println("inside studentserviceimpl");
		return stdRepo.findAll();
	}

	@Override
	public Student saveStudent(Student std) {
		// TODO Auto-generated method stub
		return stdRepo.save(std);
	}
	
	
	@Override
	public LoginStudentSpecificResponse authenticateEmp(LoginRequestDto dto) {
		// TODO Auto-generated method stub
		Student std = stdRepo.findByEmailAndPassword(dto.getEmail(), dto.getPassword())
				.orElseThrow(() -> new ResourceNotFoundException("Bad Credentials !!!!!"));
		//=> success
		return mapper.map(std, LoginStudentSpecificResponse.class);
		
	}

}
