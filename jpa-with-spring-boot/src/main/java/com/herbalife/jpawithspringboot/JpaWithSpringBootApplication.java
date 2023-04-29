package com.herbalife.jpawithspringboot;

import com.herbalife.jpawithspringboot.lab03.service.ConferenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Collections;
import java.util.Optional;

@SpringBootApplication
public class JpaWithSpringBootApplication  {

    public static void main(String[] args) {
        SpringApplication.run(JpaWithSpringBootApplication.class, args);
    }

    @Autowired
    PersonsDao personsDao;

    @Autowired
    ConferenceService conferenceService;
//
//    @Override
//    public void run(String... args) throws Exception {
//        //insertDataIntoTopics();
//
//        conferenceService.getAllTopics()
//                .stream()
//                .forEach(System.out::println);
//
//        conferenceService.updateDuration("Scala Tricks",90);
//        conferenceService.removeTopic("Goroutines");
//
//        conferenceService.getAllTopics()
//                .stream()
//                .forEach(System.out::println);
//
//
////        Optional<Person> optional = personsDao.findByIdAndFirstName(1, "mariam");
////        if(optional.isPresent()){
////            System.out.println(optional.get());
////        }
//
////        personsDao.findAllByFirstNameOrLastName("mariam", "ting")
////                .stream()
////                .forEach(System.out::println);
//
////        personsDao.findAllByFirstName("mariam")
////                .stream()
////                .forEach(System.out::println);
//
//
////        Person person = new Person();
////        person.setFirstName("Chloe");
////        person.setLastName("Ting");
////        person.setAge(25);
////        personsDao.save(person);
//        //personsDao.findAll().forEach(System.out::println);
//
//
////        Person personWithId1 = personsDao.findById(1).get();
////        personWithId1.setAge(30);
////        personsDao.save(personWithId1);
////
////        personsDao.findAll().forEach(System.out::println);
//
//        //personsDao.deleteAllById(Collections.singleton(2));
////        Optional<Person> optional = personsDao.findById(2);
////        if (optional.isPresent()) {
////            Person p = optional.get();
////            personsDao.delete(p);
////        }
////
////        personsDao.findAll().forEach(System.out::println);
//
//
//    }
//
//    private void insertDataIntoTopics() {
//        conferenceService.addTopic("Functional programming with Erlang",60);
//        conferenceService.addTopic("Scala Tricks",45);
//        conferenceService.addTopic("Spring unit testing",90);
//        conferenceService.addTopic("Unit testing JavaScript",90);
//        conferenceService.addTopic("Concurrency on the JVM",60);
//        conferenceService.addTopic("Goroutines",45);
//        conferenceService.addTopic("RoR",90);
//    }
}
