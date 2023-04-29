package com.herbalife.springbootrestapi.model;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Entity
@Table(name = "topics")
@Data
@AllArgsConstructor
@ToString
public class Topic {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "title")
    private String title;
    @Column(name = "duration")
    private int duration;

    public Topic(String title, int duration) {
        this.title = title;
        this.duration = duration;
    }
}
