package com.sample.spring.boot.first_project.controller;

import com.sample.spring.boot.first_project.model.Department;
import com.sample.spring.boot.first_project.service.DepartmentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/department")
public class DepartmentController {
    private final DepartmentService departmentService;

    public DepartmentController(DepartmentService departmentService){
        this.departmentService=departmentService;
    }

    @GetMapping
    @RequestMapping("/getDepartment")
    public List<Department> getDepartment(){
        return departmentService.getDepartment();
    }


}
