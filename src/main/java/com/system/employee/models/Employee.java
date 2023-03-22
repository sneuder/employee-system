package com.system.employee.models;

import java.time.LocalDate;
import java.util.UUID;

public class Employee {
  UUID id;
  String name;
  String secondName;
  String lastName;
  String secondLastName;
  String email;
  LocalDate dateOfBirth;
  LocalDate dateHire;
  LocalDate dateFire;

  public Employee() {
    this.id = UUID.randomUUID();
    this.name = "Enseider";
  }
}
