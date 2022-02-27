package com.bridgelabz.greetingappdevelement.controller;

import com.bridgelabz.greetingappdevelement.model.Greeting;
import com.bridgelabz.greetingappdevelement.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {
    private static final String template = "Hello %s";
    private static AtomicLong counter = new AtomicLong();

    @Autowired
    GreetingService service;

    @GetMapping("/getGreeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }



    @GetMapping("/getMessage")
    public ResponseEntity<String> Message(){
        return new ResponseEntity<String>(service.getMessage(), HttpStatus.OK);
    }


}