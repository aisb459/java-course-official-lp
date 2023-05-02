package com.herbalife.lab08consumerapp;

import com.herbalife.model.Movie;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;

import java.util.function.Consumer;

@Configuration
public class MovieConsumer {
    @Bean
    public Consumer<Movie> consumerMovieInformation() {
        return (movie) -> {
            System.out.println("*****RECEIVED " + movie);
        };
    }
}
