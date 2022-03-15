package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student;
import com.example.demo.service.IStudentService;



@RestController
@RequestMapping("/student")
public class StudentController {

	@Autowired
	private IStudentService service;

	//1.save Student
	@PostMapping("/save")
	public ResponseEntity<String> saveStudent(@RequestBody Student std){
		ResponseEntity<String> response = null;
		
	//call the service
		Integer id = service.saveStudent(std);
		String msg = "Student with id '"+id+"' is saved";
		response = new ResponseEntity<String>(msg,HttpStatus.OK);
		return response;
	
	}
	
	
}
