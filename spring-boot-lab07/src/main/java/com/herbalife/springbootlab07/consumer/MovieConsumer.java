package com.herbalife.springbootlab07.consumer;

import com.herbalife.model.Movie;
import com.herbalife.springbootlab07.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.DltHandler;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.retry.annotation.Backoff;
import org.springframework.stereotype.Component;
import org.springframework.kafka.annotation.RetryableTopic;

@Component
public class MovieConsumer {
    @Autowired
    private MovieRepository movieRepository;

    @RetryableTopic(attempts = "4", backoff = @Backoff(delay = 2000, multiplier = 2.0))
    @KafkaListener(topics = "movie-topic", groupId = "movie-consumer-local")
    public void computeMovieData(Movie movie) {
        System.out.println("***Received " + movie.getTitle() + " , " + movie.getYear() + " , " + movie.getError());
        com.herbalife.springbootlab07.entity.Movie movie1 = new com.herbalife.springbootlab07.entity.Movie(movie.getTitle(), movie.getYear(), movie.getError());

        if ("false".equals(movie.getError())) {
            movieRepository.save(movie1);
        } else {
            throw new RuntimeException("Error");
        }


    }

    @DltHandler
    public void deadLetterTopicCallback(Movie movie) {
        System.out.println("======== published to DLT" + movie);
    }

}
