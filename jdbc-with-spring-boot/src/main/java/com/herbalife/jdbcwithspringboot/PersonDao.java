package com.herbalife.jdbcwithspringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

@Component
public class PersonDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    public  List<Person> getAllPerson(){
        String query="select * from persons";
        return jdbcTemplate.query(query,(ResultSet rs,int rowNum)->{
            return new Person(rs.getInt("id"),rs.getString("first_name"),rs.getString("last_name"),rs.getInt("age"));
        });
    }

    public List<String> getAllFirstNames(){
        String query="select first_name from persons";
        return jdbcTemplate.queryForList(query, String.class);
    }
    public List<String> getAllLastNames(){
        String query="select last_name from persons";
        return jdbcTemplate.queryForList(query, String.class);
    }
    public  List<Map<String,Object>> getAllPersons(){
        String query="select * from persons";
        return jdbcTemplate.queryForList(query);
    }
    public void insert(String firstName,String lastName,int age){
        String query="insert into persons(first_name,last_name,age) values (?,?,?)";
        jdbcTemplate.update(query,firstName,lastName,age);
    }
    public  void delete(int id){
        String query="delete from persons where id=?";
        jdbcTemplate.update(query,id);
    }

}
