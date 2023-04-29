package com.herbalife.springbootnormalization.service;

import com.herbalife.springbootnormalization.model.Car;
import com.herbalife.springbootnormalization.model.Person;
import com.herbalife.springbootnormalization.repository.CarRepository;
import com.herbalife.springbootnormalization.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CarService {
    @Autowired
    private CarRepository carRepository;

    @Autowired
    private PersonRepository personRepository;

    public Car createCars(Car car){
        Optional<Person> op=personRepository.findByFirstName(car.getOwner().getFirstName());
        if(!op.isPresent()){
            personRepository.save(car.getOwner());
        }
        else{
            car.setOwner(op.get());
        }

        return carRepository.save(car);
    }

    public Car fetchCar(int carId){
        return carRepository.fetchCarWithPersonDetails(carId);
    }
}
