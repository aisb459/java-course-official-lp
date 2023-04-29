package com.herbalife.springbootrestapi.controller;

import com.herbalife.springbootrestapi.model.Topic;
import com.herbalife.springbootrestapi.model.Topicdto;
import com.herbalife.springbootrestapi.service.ConferenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/topic")
public class ConferenceController {
    @Autowired
    private ConferenceService conferenceService;

    @PostMapping
    public Topicdto addTopic(@RequestBody Topicdto topicdto) {
        return conferenceService.addTopic(topicdto);
    }

    @GetMapping
    public List<Topic> getAllTopics() {
        return conferenceService.getAllTopics();
    }

    @PatchMapping("/{title}/{duration}")
    public void updateDuration(@PathVariable String title, @PathVariable int duration) {
        conferenceService.updateDuration(title, duration);
    }

    @DeleteMapping("/title/{title}")
    public void deleteTopic(@PathVariable String title) {
        conferenceService.removeTopic(title);
    }
}
