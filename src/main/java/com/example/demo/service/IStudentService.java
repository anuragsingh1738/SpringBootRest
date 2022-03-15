package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Student;

public interface IStudentService {

	//1.Save Student
	Integer saveStudent(Student std);
	
	//2.Get all Student
	List<Student> getAllStudent();
	
	//3.Get Student by ID
	Student getStudentById(Integer id);
	
	//4. Delete Student by ID
	void deleteStudentById(Integer id);
	
	//5. Update
	void updateStudent(Student std);
	
}
