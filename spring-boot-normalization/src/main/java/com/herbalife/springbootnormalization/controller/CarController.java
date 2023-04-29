package com.herbalife.springbootnormalization.controller;

import com.herbalife.springbootnormalization.model.Car;
import com.herbalife.springbootnormalization.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cars")
public class CarController {
    @Autowired
    private CarService carService;

    @PostMapping
    public Car createCar(@RequestBody Car car){
        return carService.createCars(car);
    }
    @GetMapping("/{id}")
    public Car fetchCars(@PathVariable("id") int carId){
        return carService.fetchCar(carId);
    }
}
