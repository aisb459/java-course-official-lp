package com.herbalife.jdbcwithspringboot.labs.constants;

public interface Queries {
    String INSERT_TOPIC = "insert into topics(title,duration) values(?,?)";
    String DELETE_TOPIC = "delete from topics where title=?";
    String SELECT_TOPICS = "select * from topics";
}
