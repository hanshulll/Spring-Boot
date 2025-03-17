package com.hanshul.spring_security_project.model;

import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "students")
public class Student {

	private int id;
	private String name;
	private int age;
	
}
