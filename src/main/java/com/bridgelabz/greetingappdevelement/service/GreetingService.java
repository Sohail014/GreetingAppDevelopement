package com.bridgelabz.greetingappdevelement.service;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {

    public String getMessage(){
        return "Hello World";
    }

    public String getGreetingMessage(String firstName, String lastName) {
        return "Hello " + firstName + "" + lastName;
    }
}
