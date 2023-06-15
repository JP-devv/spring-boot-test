package com.example.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot.model.Car;

@RestController
public class CarController {

    @GetMapping("/car")
    public Car getCar() {
        return new Car("Red", 2020, 100000);
    }
}