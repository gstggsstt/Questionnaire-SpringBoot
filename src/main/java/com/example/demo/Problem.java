package com.example.demo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@ToString
@AllArgsConstructor
public class Problem {
    @Getter @Setter
    private String title, type, inputType, placeHolder;
    @Getter @Setter
    private Double step;
    @Getter @Setter
    private Boolean required;
    @Getter @Setter
    private List<String> options;
}
