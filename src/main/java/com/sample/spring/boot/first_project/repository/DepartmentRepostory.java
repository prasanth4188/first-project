package com.sample.spring.boot.first_project.repository;

import com.sample.spring.boot.first_project.model.Department;
import com.sample.spring.boot.first_project.model.DepartmentID;
import jakarta.persistence.QueryHint;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.QueryHints;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DepartmentRepostory extends JpaRepository<Department, DepartmentID> {

    @QueryHints(@QueryHint(name = "org.hibernate.readOnly", value = "true"))
    List<Department> findAll();
}
