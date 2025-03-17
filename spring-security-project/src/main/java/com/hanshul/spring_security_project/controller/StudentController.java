package com.hanshul.spring_security_project.controller;

import com.hanshul.spring_security_project.model.Student;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class StudentController {
    private List<Student> studentList = new ArrayList<>(Arrays.asList(
            new Student(1, "Hanshul Chandel", 24),
            new Student(2, "Sharad Dutta", 27)
    ));

    @GetMapping("/students")
    public List<Student> getAllStudent() {
        return studentList;
    }
    @PostMapping("/student")
    public void createNewStudent(@RequestBody Student student) {
        studentList.add(student);
    }
    @GetMapping("csrf-token")
    public CsrfToken getCsrfToken(HttpServletRequest httpRequest) {
        //  x-csrf-token
        return (CsrfToken) httpRequest.getAttribute("_csrf");
    }
}
