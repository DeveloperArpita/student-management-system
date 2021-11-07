package com.example.sms.controller;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import com.example.sms.service.StudentService;
@Controller

public class StudentController {

	private StudentService studentService;

	public StudentController(StudentService studentService) {
		super();
		this.studentService = studentService;
	}
	//handler method to handle list of students and return mode and view
	@GetMapping("/Students")
	public String listStudents(Model model) {
		model.addAttribute("students",studentService.getAllStudents());
		return "students";
	}
	@GetMapping("/students/new")
public String createStudentForm(Model model) {
		Student student=new Student();
		model.addAttribute("student",student);
		return 'create_student';

	
	
}
	@PostMapping("/students")
	public String saveStudent(@ModelAttribute("student")Student student) {
		studentService.saveStudent(student);
		return "redirect:/students"
	}
}