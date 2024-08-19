package com.abhinavcodes.officeData.service;

import com.abhinavcodes.officeData.entity.Employee;
import com.abhinavcodes.officeData.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
     private EmployeeRepository employeeRepository;

    public List<Employee> getAll(){
        return employeeRepository.findAll();
    }

    public Optional<Employee> getById(int id) {
       return employeeRepository.findByEmpId(id);
    }

    public void addEmployee(Employee employee) {
        employeeRepository.save(employee);
    }

    public void deleteEmployee(int id) {
        employeeRepository.deleteById(id);
    }


    public void updateEmployeeById(int id, Employee Updatedemployee) {
        Employee existingEmployee = employeeRepository.findByEmpId(id).orElse(null);

        if(existingEmployee!=null)
        {
            existingEmployee.setEmpName(Updatedemployee.getEmpName());
            existingEmployee.setSalary(Updatedemployee.getSalary());
            existingEmployee.setDepartment(Updatedemployee.getDepartment());
            employeeRepository.save(existingEmployee);
        }
        else{
            throw new RuntimeException("Employee with id " + id + " not found");
        }



        }

    public Optional<List<Employee>> getAllEmployeesStrartingWith(String s) {
        return employeeRepository.findByEmpNameStartingWith(s);
    }
}

