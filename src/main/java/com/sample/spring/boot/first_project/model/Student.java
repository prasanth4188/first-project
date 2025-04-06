package com.sample.spring.boot.first_project.model;


import com.sample.spring.boot.first_project.service.StudentID;
import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@ToString
@EqualsAndHashCode
@Table(name = "student", schema = "college")
@Cacheable(value = false)
@IdClass(StudentID.class)
public class Student {

    @Id
    @Column(name = "student_id", nullable = false)
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
