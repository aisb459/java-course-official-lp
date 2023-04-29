package com.herbalife.springbootlab07.repository;

import com.herbalife.springbootlab07.entity.MovieError;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieErrorRepository extends MongoRepository<MovieError,String> {
}
