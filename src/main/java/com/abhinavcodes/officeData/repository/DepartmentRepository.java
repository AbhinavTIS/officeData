package com.abhinavcodes.officeData.repository;

import com.abhinavcodes.officeData.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department,Integer>{
}
