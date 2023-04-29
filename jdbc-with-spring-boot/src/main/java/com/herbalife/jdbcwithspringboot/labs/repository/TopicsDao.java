package com.herbalife.jdbcwithspringboot.labs.repository;

import com.herbalife.jdbcwithspringboot.labs.constants.Queries;
import com.herbalife.jdbcwithspringboot.labs.model.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.util.List;

@Component
public class TopicsDao {
    //methods to add/remove/list all topics
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void addTopics(String title, int duration) {
        String query = Queries.INSERT_TOPIC;
        jdbcTemplate.update(query, title, duration);
    }

    public void deleteTopic(String title) {
        String query = Queries.DELETE_TOPIC;
        jdbcTemplate.update(query, title);
    }

    public List<Topic> listAllTopics() {
        String query = Queries.SELECT_TOPICS;
        return jdbcTemplate.query(query, (ResultSet rs, int rowNum) -> {
            return new Topic(rs.getInt("id"), rs.getString("title"), rs.getInt("duration"));
        });

    }

    public List<String> getAllTitles() {
        String query = "select title from topics";
        return jdbcTemplate.queryForList(query, String.class);
    }


}
