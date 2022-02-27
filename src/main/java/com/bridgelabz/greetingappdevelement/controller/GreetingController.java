package com.bridgelabz.greetingappdevelement.controller;

import com.bridgelabz.greetingappdevelement.model.Greeting;
import org.springframework.web.bind.annotation.*;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {
    private static final String template = "Hello %s";
    private static AtomicLong counter = new AtomicLong();

    @GetMapping("/getGreeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }

    @PostMapping("/postGreeting")
    public Greeting sayHello(@RequestBody Greeting greeting) {
        return new Greeting(counter.incrementAndGet(), String.format(template, greeting.getContent()));
    }

    @PutMapping("/putMapping/{counter}")
    public Greeting sayHello(@PathVariable long counter, @RequestParam(value = "content") String content) {
        return new Greeting(counter, String.format(template, content));
    }
}