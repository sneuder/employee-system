package com.system.employee.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.system.employee.models.Position;
import com.system.employee.repositories.PositionRepository;

@Service
public class PositionService {
  private final PositionRepository positionRepository;

  @Autowired
  public PositionService(PositionRepository positionRepository) {
    this.positionRepository = positionRepository;
  }

  public List<Position> getPositions(){
    return positionRepository.findAll();
  }

  public Optional<Position> getPosition(Long positionId){
    return positionRepository.findById(positionId);
  }

  public void postPosition(Position newPosition){
    positionRepository.save(newPosition);
  }

  public void deletePosition(Long positionId) {
    positionRepository.deleteById(positionId);
  }
}
