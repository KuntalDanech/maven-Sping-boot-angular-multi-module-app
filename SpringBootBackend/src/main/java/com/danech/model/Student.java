package com.danech.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "Student")
public class Student {
	@Id
	@GeneratedValue
	private Integer id;
	private String name;
	private String course;
	private Double stdFees;
	private Double gst;
	private Double discount;
}