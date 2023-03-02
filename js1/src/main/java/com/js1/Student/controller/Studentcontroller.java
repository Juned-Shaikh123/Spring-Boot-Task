package com.js1.Student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.js1.Student.Entity.Student;
import com.js1.Student.model.Response;
import com.js1.Student.service.Studentservice;





@RestController
public class Studentcontroller {
	
	@Autowired
	private Studentservice service;
	
	@PostMapping("/Insert")
	public Response addStudent(@RequestParam(name = "r_no") int r_no,
			@RequestParam(name = "s_name") String s_name,
			@RequestParam(name = "b_date") String b_date,@RequestParam(name = "s_cont") String s_cont)
			{
		Response res = new Response();
		Student s = new Student();
		s.setR_no(r_no);
		s.setS_name(s_name);
		s.setB_date(b_date);
		s.setS_cont(s_cont);
		
		s = service.addStudent(s);
		if (s != null) {
			res.setMsg("Student added");
			res.setStatus(true);
		}

		return res;
	}

	@DeleteMapping("/delete")
	public Response deleteStudent(@RequestParam(name = "r_no") int r_no) {
		Response response = new Response();
		try {
			service.deleteStudent(r_no);
			response.setMsg("Student deleted Successfully");
			response.setStatus(true);
		} catch (Exception e) {
		}

		return response;

	}

	@GetMapping("/getStudent")
	public Student getStudent(@RequestParam(name = "r_no") int r_no) {
		return service.getStudentById(r_no);
	}

	@GetMapping("/getAllStudent")
	public List<Student> getAllStudent() {
		return service.getAllStudent();
	}

	@PostMapping("/Update")
	public Response UpdateStudent(@RequestParam(name = "r_no") int r_no,
			@RequestParam(name = "s_name") String s_name,
			@RequestParam(name = "b_date") String b_date,@RequestParam(name = "s_contact") String s_cont) {
		Response res = new Response();
		Student s = service.getStudentById(r_no);
		s.setR_no(r_no);
		s.setS_name(s_name);
		s.setB_date(b_date);
		s.setS_cont(s_cont);
		
		try {
			s = service.addStudent(s);
		} catch (Exception e) {
		}
		if (s != null) {
			res.setStatus(true);
			res.setMsg("College updated");
		}
		return res;

	}


}
