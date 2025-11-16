package com.example.helloworld.service;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {

    public void printMessage(){
        System.out.println("Greeting from Spring boot");
    }
}
