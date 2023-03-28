package com.system.employee.models;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Position {
  @Id
  @SequenceGenerator(name = "positon_sequence", sequenceName = "position_sequence", allocationSize = 1)
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "position_sequence")

  private Long id;
  private String name;

  @OneToMany(mappedBy = "position", cascade = CascadeType.ALL)
  private List<Employee> employees;

  public Position() {

  }

  public Long getId() {
    return this.id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public List<Employee> getEmployees() {
    return this.employees;
  }

  public void setEmployees(List<Employee> employees) {
    this.employees = employees;
  }

}
