package com.herbalife.springbootrestapi.service;


import com.herbalife.springbootrestapi.exception.TopicFoundException;
import com.herbalife.springbootrestapi.exception.TopicNotFoundException;
import com.herbalife.springbootrestapi.model.Topic;
import com.herbalife.springbootrestapi.model.Topicdto;
import com.herbalife.springbootrestapi.repository.TopicRepository;
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

    public Topicdto addTopic(Topicdto topicdto) {
        Optional<Topic> optional = topicRepository.findByTitle(topicdto.getTitle());
        if (optional.isPresent()) {
            throw new TopicFoundException("Topic already found");
        } else {
            topicRepository.save(new Topic(topicdto.getTitle(), topicdto.getDuration()));
        }
        return topicdto;

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
