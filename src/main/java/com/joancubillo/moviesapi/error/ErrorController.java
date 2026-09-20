package com.joancubillo.moviesapi.error;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class ErrorController implements org.springframework.boot.webmvc.error.ErrorController {
    @RequestMapping("/error")
    public ResponseEntity<Map<String, Object>> ReturnError(){
        Map<String, Object> response = new HashMap<>();
        response.put("message", "Unexpected error");
        response.put("statusCode", 500);
        return ResponseEntity.status(500).body(response);
    }
}
