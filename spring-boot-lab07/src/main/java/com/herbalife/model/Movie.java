package com.herbalife.model;

import org.springframework.data.mongodb.core.mapping.Field;

public class Movie {


    private String title;

    private Integer year;

    private String error;





    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", year=" + year +
                ", error='" + error + '\'' +
                '}';
    }
}
