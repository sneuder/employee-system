package com.system.employee.services;

import java.util.List;
import com.system.employee.models.Employee;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
  public List<Employee> getEmployees() {
    return List.of(new Employee());
  } 
}
