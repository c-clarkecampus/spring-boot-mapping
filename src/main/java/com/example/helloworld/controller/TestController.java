package com.example.helloworld.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class TestController {

    @GetMapping("/print")
    public String printString(@RequestParam(value = "num1") Integer num1,
                              @RequestParam(value = "num2") Integer num2) {
        return "HelloWorld";
    }

    //Create new api to print summation with two input parameters
    @GetMapping("/sumPathPractice/{num1}/{num2}")
    public Integer summation(@PathVariable("num1") Integer value1,
                             @PathVariable("num2") Integer value2) {
        return (value1 + value2);
    }





}
