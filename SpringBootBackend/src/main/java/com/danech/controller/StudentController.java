package com.danech.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.danech.model.Student;
import com.danech.service.IStudentService;

@RestController
@RequestMapping("/student")
@CrossOrigin("http://localhost:4200")
public class StudentController {

	@Autowired
	private IStudentService service;
	
	// 1. save
	@PostMapping("/save")
	public ResponseEntity<String> save(
			@RequestBody Student stundet
			){
		var id = service.saveStudent(stundet);
		return ResponseEntity.ok("Student : "+id+" saved");
	}
	
	// 2. update
	@PutMapping("/update")
	public ResponseEntity<String> update(
			@RequestBody Student stundet
			){
		service.updateStudent(stundet);
		return ResponseEntity.ok("Student : "+stundet.getId()+" updated");
	}

	// 3. Get by one
	@GetMapping("/one/{id}")
	public ResponseEntity<Student> update(
			@PathVariable Integer id
			){
		Student student = service.getOneStudent(id);
		return ResponseEntity.ok(student);
	}
	
	// 4. delete
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> delete(
			@PathVariable Integer id
			){
		service.deleteStudent(id);
		return ResponseEntity.ok("Student : "+id+" deleted");
	}

	// 5. Get all
	@GetMapping("/all")
	public ResponseEntity<List<Student>> all(){
		return ResponseEntity.ok(service.getAllStudents());
	}
}