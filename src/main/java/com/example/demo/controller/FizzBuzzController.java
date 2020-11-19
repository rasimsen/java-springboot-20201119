package com.example.demo.controller;

import com.example.demo.service.FizzBuzzService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1.0")
public class FizzBuzzController {
    @Autowired
    private FizzBuzzService fizzBuzzService;

    @GetMapping("/fizzbuzz/validate/{value}")
    public String validate(@PathVariable int value) {
        return fizzBuzzService.validation(value);
    }

}
