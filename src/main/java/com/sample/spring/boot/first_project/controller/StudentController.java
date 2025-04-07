package com.sample.spring.boot.first_project.controller;

import com.sample.spring.boot.first_project.component.MicroService;
import com.sample.spring.boot.first_project.model.Student;
import com.sample.spring.boot.first_project.service.StudentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/student")
@Slf4j
public class StudentController {

    private final StudentService studentService;

    private final MicroService microService;

    public StudentController(StudentService studentService, MicroService microService) {
        this.studentService = studentService;
        this.microService = microService;
    }

    @GetMapping
    @RequestMapping("/getStudents")
    public List<Student> getStudents() {
        log.info("get Students are invoked");
        return studentService.getStudents();
    }

    @PostMapping
    @RequestMapping("/create")
    public Student createStudent(@RequestBody Student student) {
        log.info("Create student is invoked");
        return studentService.save(student);
    }

    @GetMapping
    @RequestMapping("/getStudentsFromMicroService")
    public List<Student> getStudentsFromMicroservice() {
        return microService.getStudentFromMicroService();
    }


}
