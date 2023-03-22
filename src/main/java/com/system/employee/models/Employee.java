package com.system.employee.models;

import java.time.LocalDate;
// import java.util.UUID;

import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.SequenceGenerator;

@Entity
@Table
public class Employee {
  @Id
  @SequenceGenerator(name = "employee_sequence", sequenceName = "employee_sequence", allocationSize = 1)
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "empoyee_sequence")

  Long id;
  String firstName;
  String secondName;
  // String lastName;
  // String secondLastName;
  // String email;
  // LocalDate dateOfBirth;
  // LocalDate dateHire;
  // LocalDate dateFire;
  // Float salary;

  public Employee(Long id, String firstName, String secondName) {
    this.id = id;
    this.firstName = firstName;
    this.secondName = secondName;
  }

}
