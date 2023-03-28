package com.system.employee.models;

import java.time.LocalDate;
// import java.util.UUID;

import jakarta.persistence.*;

@Entity
public class Employee {
  @Id
  @SequenceGenerator(name = "employee_sequence", sequenceName = "employee_sequence", allocationSize = 1)
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "empoyee_sequence")

  private Long id;
  private String firstName;
  private String secondName;
  private String lastName;
  private String secondLastName;
  private String email;
  private LocalDate dateOfBirth;
  private LocalDate dateHire;
  private LocalDate dateFire;
  private Float salary;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "position_id")
  private Position position;

  public Employee() {

  }

  public Long getId() {
    return this.id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getFirstName() {
    return this.firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getSecondName() {
    return this.secondName;
  }

  public void setSecondName(String secondName) {
    this.secondName = secondName;
  }

  public String getLastName() {
    return this.lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getSecondLastName() {
    return this.secondLastName;
  }

  public void setSecondLastName(String secondLastName) {
    this.secondLastName = secondLastName;
  }

  public String getEmail() {
    return this.email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public LocalDate getDateOfBirth() {
    return this.dateOfBirth;
  }

  public void setDateOfBirth(LocalDate dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }

  public LocalDate getDateHire() {
    return this.dateHire;
  }

  public void setDateHire(LocalDate dateHire) {
    this.dateHire = dateHire;
  }

  public LocalDate getDateFire() {
    return this.dateFire;
  }

  public void setDateFire(LocalDate dateFire) {
    this.dateFire = dateFire;
  }

  public Float getSalary() {
    return this.salary;
  }

  public void setSalary(Float salary) {
    this.salary = salary;
  }

}
