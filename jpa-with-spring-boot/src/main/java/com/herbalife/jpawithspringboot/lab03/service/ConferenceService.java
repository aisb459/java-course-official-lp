package com.herbalife.jpawithspringboot.lab03.service;

import com.herbalife.jpawithspringboot.lab03.exception.TopicFoundException;
import com.herbalife.jpawithspringboot.lab03.exception.TopicNotFoundException;
import com.herbalife.jpawithspringboot.lab03.model.Topic;
import com.herbalife.jpawithspringboot.lab03.repository.TopicRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
//@Transactional
public class ConferenceService {
    @Autowired
    private TopicRepository topicRepository;

    public void addTopic(String title, int duration) {
        Optional<Topic> optional = topicRepository.findByTitle(title);
        if (optional.isPresent()) {
            throw new TopicFoundException("Topic already found");
        } else {
            topicRepository.save(new Topic(title, duration));
        }

    }

    public List<Topic> getAllTopics() {
        return topicRepository.findAll();
    }
    @Transactional
    public void removeTopic(String title) {
        Optional<Topic> optional = topicRepository.findByTitle(title);
        if (optional.isPresent()) {
            topicRepository.deleteTopic(title);
//            Topic topic = optional.get();
//            topicRepository.delete(topic);

        } else {
            throw new TopicNotFoundException("Topic Not Found");
        }

    }
    @Transactional
    public void updateDuration(String title, int duration) {
        Optional<Topic> optional = topicRepository.findByTitle(title);
        if (optional.isPresent()) {
            topicRepository.updateDuration(title, duration);
//            Topic topic = optional.get();
//            topic.setDuration(duration);
//            topicRepository.save(topic);
        } else {
            throw new TopicNotFoundException("Topic Not Found");
        }
    }
}
