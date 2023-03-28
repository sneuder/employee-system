package com.system.employee.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.system.employee.models.Position;

@Repository
public interface PositionRepository extends JpaRepository<Position, Long> {
  
}
