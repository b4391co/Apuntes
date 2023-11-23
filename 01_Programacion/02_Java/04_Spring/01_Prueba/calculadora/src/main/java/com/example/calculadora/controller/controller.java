package com.example.calculadora.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/")
@RestController
public class controller {

    @GetMapping("/")
    public String hello() {
        return "hello";
    }

    @GetMapping("/sum/{num1}/{num2}")
    public int isTest(@PathVariable int num1, @PathVariable int num2) {
        return num1 + num2;
    }
}
