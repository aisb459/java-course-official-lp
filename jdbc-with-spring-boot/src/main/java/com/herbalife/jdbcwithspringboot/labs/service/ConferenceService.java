package com.herbalife.jdbcwithspringboot.labs.service;

import com.herbalife.jdbcwithspringboot.labs.constants.Messages;
import com.herbalife.jdbcwithspringboot.labs.model.Topic;
import com.herbalife.jdbcwithspringboot.labs.repository.TopicsDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ConferenceService {
    @Autowired
    private TopicsDao topicsDao;

    public void addTopic(String title, int duration) {
        if (topicsDao.getAllTitles().contains(title)) {
            throw new RuntimeException(Messages.TOPIC_EXISTS);
        } else {
            topicsDao.addTopics(title, duration);
        }

    }

    public List<Topic> getAllTopics() {
        return topicsDao.listAllTopics();

    }

    public void removeTopic(String title) {
        if (topicsDao.getAllTitles().contains(title)) {
            topicsDao.deleteTopic(title);
        } else {
            throw new RuntimeException(Messages.TOPIC_NOT_FOUND);
        }

    }
}
