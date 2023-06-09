package com.herbalife.jpawithspringboot;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface PersonsDao extends JpaRepository<Person, Integer> {
    @Query(value = "select p from Person p where p.age between :min and :max")
    List<Person> computePersonsWithAgeBetween(@Param("min") int min, @Param("max") int max);

    @Query(value = "select p from Person p where p.firstName=:fname")
    List<Person> computePersonsWithFirsName(@Param("fname") String firstName);

    @Query(value = "select * from persons where first_name=:fname", nativeQuery = true)
    List<Person> computePersonsWithFirsNameInNativeSQL(@Param("fname") String firstName);

    List<Person> findAllByFirstName(String firstName); //select * from persons where p.first_name = ?

    List<Person> findAllByFirstNameOrLastName(String firstName, String lastName);

    Optional<Person> findByIdAndFirstName(int id, String firstName);

    List<Person> findAllByFirstNameAndLastNameAndAge(String firstName, String lastName, int age);

    List<Person> findAllByAgeGreaterThan(int age);

    List<Person> findAllByAgeGreaterThanEqual(int age);

    List<Person> findAllByFirstNameOrderByAgeDesc(String firstName);

    List<Person> findAllByFirstNameIn(List<String> firstNames);
}
