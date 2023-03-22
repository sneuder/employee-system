package com.system.employee.services;

import java.util.List;
import com.system.employee.models.Employee;
import com.system.employee.repositories.EmployeeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EmployeeService {

  private final EmployeeRepository employeeRepository;

  @Autowired
  public EmployeeService(EmployeeRepository employeeRepository) {
    this.employeeRepository = employeeRepository;
  }

  public List<Employee> getEmployees() {
    return employeeRepository.findAll();
  }

  public void postEmployee(Employee newEmployee) {
    employeeRepository.save(newEmployee);
  }
}
