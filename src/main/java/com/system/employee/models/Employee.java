package com.system.employee.models;

import java.time.LocalDate;
// import java.util.UUID;

import jakarta.persistence.Id;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.SequenceGenerator;

@Entity
public class Employee {
  @Id
  @SequenceGenerator(name = "employee_sequence", sequenceName = "employee_sequence", allocationSize = 1)
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "empoyee_sequence")

  private Long id;
  private String firstName;
  private String secondName;
  // String lastName;
  // String secondLastName;
  // String email;
  // LocalDate dateOfBirth;
  // LocalDate dateHire;
  // LocalDate dateFire;
  // Float salary;

  public Employee(String firstName, String secondName) {
    this.firstName = firstName;
    this.secondName = secondName;
  }
  
  public Employee() {

  }

  public void setId(Long id) {
    this.id = id;
  }

  public Long getId() {
    return id;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setSecondName(String secondName) {
    this.secondName = secondName;
  }

  public String getSecondName() {
    return secondName;
  }

}
