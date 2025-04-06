package com.sample.spring.boot.first_project.repository;

import com.sample.spring.boot.first_project.model.Student;
import com.sample.spring.boot.first_project.model.StudentID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, StudentID> {
    List<Student> findAll();
}