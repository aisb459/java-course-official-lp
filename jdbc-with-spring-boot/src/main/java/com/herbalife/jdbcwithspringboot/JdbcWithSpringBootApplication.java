package com.herbalife.jdbcwithspringboot;

import com.herbalife.jdbcwithspringboot.labs.service.ConferenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JdbcWithSpringBootApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(JdbcWithSpringBootApplication.class, args);
	}

	@Autowired
	private PersonDao personDao;
	@Autowired
	private ConferenceService conferenceService;

	@Override
	public void run(String... args) throws Exception {
		//addSomeData();
		conferenceService.getAllTopics().forEach(System.out::println);
		//conferenceService.addTopic("Functional programming with Erlang",60);
		//conferenceService.removeTopic("RoR");






		//personDao.insert("Mariam","Joe",20);
		//personDao.insert("Jamal","Frik",25);
		//personDao.insert("Vidian","Beri",26);
		//personDao.delete(2);
		//personDao.getAllFirstNames().forEach(System.out::println);
		//personDao.getAllLastNames().forEach(e-> System.out.println(e));
//		personDao.getAllPersons().forEach(record->{
//			record.forEach((k,v)-> System.out.println(k+" = "+v));
//		});
		//personDao.getAllPersons().forEach(System.out::println);
	}

	private void addSomeData() {
		conferenceService.addTopic("Functional programming with Erlang",60);
		conferenceService.addTopic("Scala Tricks",45);
		conferenceService.addTopic("Spring unit testing",90);
		conferenceService.addTopic("Unit testing JavaScript",90);
		conferenceService.addTopic("Concurrency on the JVM",60);
		conferenceService.addTopic("Goroutines",45);
		conferenceService.addTopic("RoR",90);
	}
}
