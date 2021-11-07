package com.example.sms.service.impl;

import com.example.sms.service.StudentService;
import java.util.List;
import com.example.sms.entity.Student;
import com.example.sms.repository.StudentRepository;
import org.springframework.stereotype.Service;

@Service

public class StudentServiceImpl implements StudentService {
	
	private StudentRepository StudentRepository;
	
	
	
	public StudentServiceImpl(StudentRepository studentRepository) {
		super();
		this.StudentRepository = studentRepository;
	}



	@Override
	public List<Student> getAllStudents(){
		//TODO Auto  generated method stub
		return StudentRepository.findAll();
	}
	@Override
	public Student saveStudent(Student student) {
		//TODO Auto  generated method stub
		return StudentRepository.save(student);
	}

}
