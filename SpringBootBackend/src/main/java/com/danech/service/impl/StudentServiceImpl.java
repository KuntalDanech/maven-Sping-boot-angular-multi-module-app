package com.danech.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.danech.model.Student;
import com.danech.repository.StudentRepository;
import com.danech.service.IStudentService;
import com.danech.util.StudentUtil;

@Service
public class StudentServiceImpl implements IStudentService {

	@Autowired
	private StudentRepository repo;
	
	@Override
	public List<Student> getAllStudents() {
		return repo.findAll();
	}

	@Override
	public Integer saveStudent(Student student) {
		StudentUtil.doCalculation(student);		
		repo.save(student);
		return student.getId();
	}

	@Override
	public void deleteStudent(Integer id) {
		repo.deleteById(id);
	}

	@Override
	public void updateStudent(Student student) {
		StudentUtil.doCalculation(student);		
		repo.save(student);
	}

	@Override
	public Student getOneStudent(Integer id) {
		Optional<Student> opl = repo.findById(id);
		if(opl.isPresent())
				return opl.get();
		else
			return null;
	}

}
