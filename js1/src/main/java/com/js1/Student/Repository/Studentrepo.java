package com.js1.Student.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.js1.Student.Entity.Student;

@Repository
public interface Studentrepo extends JpaRepository<Student, Integer> {

	
}
