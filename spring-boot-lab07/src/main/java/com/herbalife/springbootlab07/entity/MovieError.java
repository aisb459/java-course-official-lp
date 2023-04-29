package com.herbalife.springbootlab07.entity;


import lombok.Data;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@ToString
@Document(collection="movie-errors")
public class MovieError {
    @Id
    private String id;
    @Field(name = "title")
    private String title;
    @Field(name = "year")
    private Integer year;
    @Field(name = "error")
    private String error;

    public MovieError(String title, Integer year, String error) {
        this.title = title;
        this.year = year;
        this.error = error;
    }
}
