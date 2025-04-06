package com.sample.spring.boot.first_project.model;


import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Data
@ToString
@EqualsAndHashCode
@Table(name = "student", schema = "college")
@Cacheable(value = false)
@IdClass(StudentID.class)
public class Student {

    @Id
    @Column(name = "student_id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "email")
    private String email;

    @Column(name = "phone")
    private String phone;

    @Column(name = "dob", nullable = false)
    private LocalDate dob;

    @Column(name = "department_id")
    private int departmentId;

    @Column(name = "admission_year")
    private int admissionYear;


}
