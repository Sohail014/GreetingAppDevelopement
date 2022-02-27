package com.bridgelabz.greetingappdevelement.service;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {

    public String getMessage(){
        return "this is a message from spring boot application";
    }
}
