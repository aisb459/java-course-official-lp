package com.herbalife.springbootrestapi.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@AllArgsConstructor
@ToString
public class Topicdto {
    private String title;
    private int duration;

}
