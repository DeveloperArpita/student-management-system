package com.example.sms;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.sms.repository.StudentRepository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.beans.factory.annotation.Autowired;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}
	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public void run(String args)throws Exception{
		/*Student student1=new Student("Arpita","Konar","akonar202@gmail.com");
		studentRepository.save(student1);
		
		Student student2=new Student("Antara","Konar","antarakonar16@gmail.com");
		studentRepository.save(student2);*/
	}

}
