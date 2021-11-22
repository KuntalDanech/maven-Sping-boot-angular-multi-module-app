package com.danech.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.danech.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}