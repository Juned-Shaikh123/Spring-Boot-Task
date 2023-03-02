package com.js1.Student.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.js1.Student.Entity.Student;
import com.js1.Student.Repository.Studentrepo;



@Service
public class Studentservice {
	
	@Autowired
	private Studentrepo repo;
	
	public Student addStudent(Student s) {
		return repo.save(s);
	}

	public List<Student> getAllStudent() {
		return repo.findAll();

	}

	public Student getStudentById(int id) {
		return repo.findById(id).get();
	}

	public void deleteStudent(int id) {
		
		repo.deleteById(id);
	}

	

}
