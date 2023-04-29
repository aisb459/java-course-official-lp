package com.herbalife.springbootlab07.consumer;



import com.herbalife.model.Movie;
import com.herbalife.springbootlab07.entity.MovieError;
import com.herbalife.springbootlab07.repository.MovieErrorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class DltConsumer {
    @Autowired
    private MovieErrorRepository movieErrorRepository;

    @KafkaListener(topics = "movie-topic-dlt", groupId = "dlt-consumer-local")
    public void processMovie(Movie movie) {
        System.out.println("***Received " + movie + " from DLT");
        MovieError movieError=new MovieError( movie.getTitle(),movie.getYear(),movie.getError());
        movieErrorRepository.save(movieError);
    }
}
