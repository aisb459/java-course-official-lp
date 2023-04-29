package com.herbalife.springbootbasics;

import com.herbalife.springbootbasics.lab01.Conference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootBasicsApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootBasicsApplication.class, args);
	}

	@Autowired
	Car car;

	@Autowired
	Person person;

	@Autowired
	Company company;
	@Autowired
	Conference conference;

	@Override
	public void run(String... args) throws Exception {
//		System.out.println(car.getName());
//		System.out.println(person.getName());
//		System.out.println(company.getName()+" , "+company.getNumOfEmployees());
//		company.getCountries().forEach(e-> System.out.println(e));
	conference.printSessions();

	}
}
