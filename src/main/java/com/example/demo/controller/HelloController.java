package com.example.demo.controller;

import com.example.demo.model.Message;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/messages")
public class HelloController {

    @GetMapping("/example")
        public String example() {
            return "Example response";
        }

    @GetMapping("/hello")
    public String helloWorld() {
        return "Witaj w aplikacji Spring Boot!";
    }

    @PostMapping("/create")
    public ResponseEntity<String> createMessage(@RequestBody Message message) {
        String response = "Otrzymano wiadomość: '" + message.getContent() + "' od autora: " + message.getAuthor();
        return ResponseEntity.ok(response);
    }

}
