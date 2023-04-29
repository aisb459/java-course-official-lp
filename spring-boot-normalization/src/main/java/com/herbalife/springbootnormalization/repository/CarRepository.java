package com.herbalife.springbootnormalization.repository;

import com.herbalife.springbootnormalization.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepository extends JpaRepository<Car,Integer> {
    @Query(value = "select c from Car c join fetch c.owner where c.id = :carId")
    Car fetchCarWithPersonDetails(@Param("carId") int carId);
}
