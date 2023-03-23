package com.system.employee.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.system.employee.models.Employee;
import com.system.employee.services.EmployeeService;

import utils.Message;

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

  @GetMapping(path = "{employeeId}")
  public Optional<Employee> getEmployee(@PathVariable("employeeId") Long employeeId) {
    return employeeService.getEmployee(employeeId);
  }

  @PostMapping
  public ResponseEntity<Map<String, Object>> postEmployee(@RequestBody Employee newEmployee) {
    employeeService.postEmployee(newEmployee);
    return ResponseEntity.ok(Message.send(true, "employee created"));
  }

  @DeleteMapping(path = "{employeeId}")
  public ResponseEntity<Map<String, Object>> deleteEmployee(@PathVariable("employeeId") Long employeeId) {
    if (employeeService.getEmployee(employeeId).isPresent()) {
      employeeService.deleteEmployee(employeeId);
      return ResponseEntity.ok(Message.send(true, "employee deleted"));
    } else {
      return ResponseEntity.status(404).body(Message.send(false, "employee deleted"));
    }
  }
}
