package org.example.springk8s.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
@Slf4j
public class HelloWorldController {

    @Value("${server.port}")
    private int port;

    @GetMapping("/hello")
    public ResponseEntity<String> helloToWorld() {
        log.info("Hello World at port {}", port);
        return ResponseEntity.ok("Hello world! at port " + port);
    }
}
