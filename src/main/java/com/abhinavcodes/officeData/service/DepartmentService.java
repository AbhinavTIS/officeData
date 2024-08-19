package com.abhinavcodes.officeData.service;

import com.abhinavcodes.officeData.entity.Department;
import com.abhinavcodes.officeData.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    public List<Department> getAllDepartments(){

        return departmentRepository.findAll();

    }

    public void addNewDepartment(Department department) {
        departmentRepository.save(department);
    }
}

