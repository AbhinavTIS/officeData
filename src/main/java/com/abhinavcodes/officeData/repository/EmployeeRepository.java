package com.abhinavcodes.officeData.repository;

import com.abhinavcodes.officeData.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

    Optional<Employee> findByEmpId(int id);
    Optional<List<Employee>> findByEmpNameStartingWith(String empName);
}
