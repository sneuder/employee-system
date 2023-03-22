package com.system.employee.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.system.employee.models.Employee;
import com.system.employee.services.EmployeeService;

@RestController
@RequestMapping(path = "employee")
public class EmployeeController {

  private final EmployeeService employeeService;

  @Autowired
  public EmployeeController(EmployeeService employeeService) {
    this.employeeService = employeeService;
  }

  @GetMapping(path = "employees")
  public List<Employee> getEmployees() {
    return employeeService.getEmployees();
  }

  @GetMapping(path = "employee")
  public String getEmployee() {
    return "Esneider";
  }
}
