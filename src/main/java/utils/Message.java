package utils;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class Message {
  Boolean success;
  String message;

  public static Map<String, Object> send(Boolean success, String message) {
    Map<String, Object> response = new HashMap<>();
    response.put("success", success);
    response.put("message", message);
    return response; 
  }
 
}
