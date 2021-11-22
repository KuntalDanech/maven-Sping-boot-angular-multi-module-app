package com.danech.service;

import java.util.List;

import com.danech.model.Student;

public interface IStudentService {
	List<Student> getAllStudents();
	Integer saveStudent(Student student);
	void deleteStudent(Integer id);
	void updateStudent(Student student);
	Student getOneStudent(Integer id);	
}
