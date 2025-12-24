package com.apps.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@RestController
@RequestMapping("/api")
public class HelloController {

    @GetMapping
    public ResponseEntity<String> greetMsg() {
        System.out.println("hello service.");
        String msg = "hello service. welcome. - " + LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MMMM-yyyy, hh:mm:ss:SSS a"));
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.TEXT_PLAIN);
        return new ResponseEntity<>(msg, headers, HttpStatus.OK);
    }

}
