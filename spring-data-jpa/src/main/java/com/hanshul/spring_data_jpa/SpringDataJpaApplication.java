package com.hanshul.spring_data_jpa;

import com.hanshul.spring_data_jpa.model.Student;
import com.hanshul.spring_data_jpa.repository.StudentRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDataJpaApplication {

	public static void main(String[] args) {
		ApplicationContext context=	SpringApplication.run(SpringDataJpaApplication.class, args);
		Student s1= context.getBean(Student.class);
		Student s2=context.getBean(Student.class);
		Student s3=context.getBean(Student.class);

		StudentRepository repo=context.getBean(StudentRepository.class);

		s1.setRollNo(101);
		s1.setName("Hanshul");
		s1.setMarks(100);


		s2.setRollNo(102);
		s2.setName("Sharad");
		s2.setMarks(100);


		s3.setRollNo(103);
		s3.setName("Harsh");
		s3.setMarks(100);

		repo.save(s1);
		repo.save(s2);
		repo.save(s3);
	}

}
