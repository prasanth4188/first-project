package com.sample.spring.boot.first_project.model;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import lombok.Data;

@Data
public class DepartmentID {
    @Id
    @Column(name = "dept_id", nullable = false)
    private Long id;

}
