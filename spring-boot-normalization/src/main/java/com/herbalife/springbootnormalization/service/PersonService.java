package com.herbalife.springbootnormalization.service;


import com.herbalife.springbootnormalization.model.Person;
import com.herbalife.springbootnormalization.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {
    @Autowired
    private PersonRepository personRepository;

    public Person createPerson(Person person){
        return personRepository.save(person);
    }

}
