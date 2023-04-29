package com.herbalife.springbootlab07.repository;

import com.herbalife.springbootlab07.entity.Movie;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends MongoRepository<Movie,String> {
}
