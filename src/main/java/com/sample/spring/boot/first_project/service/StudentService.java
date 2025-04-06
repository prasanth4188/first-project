package com.sample.spring.boot.first_project.service;

import com.sample.spring.boot.first_project.StudentAlreadyException;
import com.sample.spring.boot.first_project.model.Student;
import com.sample.spring.boot.first_project.model.StudentID;
import com.sample.spring.boot.first_project.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getStudents() {
        return studentRepository.findAll();
    }

    public Student save(Student student) {
        if( 1 == 1){
            throw new RuntimeException("For testing");
        }
        StudentID studentID = new StudentID();
        studentID.setId(student.getId());
        Optional<Student> student1 = studentRepository.findById(studentID);
        if (student1.isPresent()) {
            throw new StudentAlreadyException("Student already exists");
        } else {
            return studentRepository.save(student);
        }
    }


}
