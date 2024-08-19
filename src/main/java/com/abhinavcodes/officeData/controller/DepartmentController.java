package com.abhinavcodes.officeData.controller;

import com.abhinavcodes.officeData.entity.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.abhinavcodes.officeData.service.DepartmentService;

import java.util.List;

@RestController
@RequestMapping("/dept")
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;


    @GetMapping("all")
    public List<Department> getAllDepartments(){

       return departmentService.getAllDepartments();
    }

    @PostMapping("/add")
    public void addDepartment(@RequestBody Department department){
        departmentService.addNewDepartment(department);
    }
}
