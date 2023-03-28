package com.system.employee.controllers;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;


import com.system.employee.models.Position;
import com.system.employee.services.PositionService;

import utils.Message;

@RestController
@RequestMapping(path = "position")
public class PositionController {

  private final PositionService positionService;

  @Autowired
  public PositionController(PositionService positionService){
    this.positionService = positionService;
  }

  @GetMapping(path = "positions")
  public List<Position> getPositions (){
    return positionService.getPositions();
  }

  @GetMapping(path = "{positionId}")
  public Optional<Position> getPosition (@PathVariable("positionId") Long positionId){
    return positionService.getPosition(positionId);
  }

  @PostMapping
  public ResponseEntity<Map<String, Object>> postPosition(@RequestBody Position newPosition){
    positionService.postPosition(newPosition);
    return ResponseEntity.ok(Message.send(true, "position created"));
  }

  @DeleteMapping(path = "{positionId}")
  public ResponseEntity<Map<String, Object>> deletePosition(@PathVariable("positionId") Long positionId){
    positionService.deletePosition(positionId);
    return ResponseEntity.ok(Message.send(true, "position deleted"));
  }

}
