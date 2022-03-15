package com.example.demo.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Student;
import com.example.demo.repo.StudentRepository;
import com.example.demo.service.IStudentService;

@Service 
public class StudentServiceImpl implements IStudentService{
	
	@Autowired
	private StudentRepository repo;
	
	@Override
	public Integer saveStudent(Student std) {
		std = repo.save(std);
		return 1;
	}

	@Override
	public List<Student> getAllStudent() {
		return repo.findAll();
	}

	@Override
	public Student getStudentById(Integer id) {
		Optional<Student> opt = repo.findById(id);
		
		if(opt.isEmpty()) {
			return null;
		}
		
		return opt.get();
	}

	@Override
	public void deleteStudentById(Integer id) {
		repo.deleteById(id);
	}

	@Override
	public void updateStudent(Student std) {
		repo.save(std);
		
	}

}
