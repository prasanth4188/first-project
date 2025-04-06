package com.sample.spring.boot.first_project.service;

import com.sample.spring.boot.first_project.model.Department;
import com.sample.spring.boot.first_project.repository.DepartmentRepostory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {
    public DepartmentRepostory departmentRepostory;
    public DepartmentService(DepartmentRepostory departmentRepostory){
        this.departmentRepostory=departmentRepostory;
    }
    public List<Department> getDepartment(){
        return departmentRepostory.findAll();
    }

}
