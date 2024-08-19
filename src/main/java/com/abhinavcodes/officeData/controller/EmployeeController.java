package com.abhinavcodes.officeData.controller;

import com.abhinavcodes.officeData.entity.Employee;
import com.abhinavcodes.officeData.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/emp")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping("/all")
    public List<Employee> getAllEmployees(){
        return employeeService.getAll();
    }

    @GetMapping("/all/{s}")
    public Optional<List<Employee>> getAllEmployees(@PathVariable String s){
        return employeeService.getAllEmployeesStrartingWith(s);

    }

    @GetMapping("/id/{id}")
    public Optional<Employee> getById(@PathVariable int id){
        return employeeService.getById(id);
    }
    @PostMapping("/add")
    public void addEmployee(@RequestBody Employee employee){
         employeeService.addEmployee(employee);
    }

    @DeleteMapping("/remove/{id}")
    public void deleteById(@PathVariable int id){
        employeeService.deleteEmployee(id);
    }

    @PutMapping("/update/{id}")
    public void updateById(@PathVariable int id, @RequestBody Employee employee){
        employeeService.updateEmployeeById(id,employee);

    }

}

