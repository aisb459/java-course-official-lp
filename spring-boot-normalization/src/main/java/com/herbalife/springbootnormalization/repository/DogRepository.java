package com.herbalife.springbootnormalization.repository;

import com.herbalife.springbootnormalization.model.Dog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DogRepository extends JpaRepository<Dog,Integer> {
}
