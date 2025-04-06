package com.sample.spring.boot.first_project.controller;

import com.sample.spring.boot.first_project.model.Student;
import com.sample.spring.boot.first_project.service.StudentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/student")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    @RequestMapping("/getStudents")
    public List<Student> getStudents() {
        return studentService.getStudents();
    }

}
