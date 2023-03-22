package com.system.employee.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.system.employee.models.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
  
}
