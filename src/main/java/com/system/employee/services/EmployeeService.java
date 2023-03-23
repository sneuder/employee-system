package com.system.employee.services;

import java.util.List;
import java.util.Optional;

import com.system.employee.models.Employee;
import com.system.employee.repositories.EmployeeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

  private final EmployeeRepository employeeRepository;

  @Autowired
  public EmployeeService(EmployeeRepository employeeRepository) {
    this.employeeRepository = employeeRepository;
  }

  public Optional<Employee> getEmployee(Long employeeId){
    return employeeRepository.findById(employeeId);
  }

  public List<Employee> getEmployees() {
    return employeeRepository.findAll();
  }

  public void postEmployee(Employee newEmployee) {
    employeeRepository.save(newEmployee);
  }

  public void deleteEmployee(Long employeeId) {
    employeeRepository.deleteById(employeeId);
  }
}
