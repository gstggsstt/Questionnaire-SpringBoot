package com.example.demo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
public class Form {
    @Getter @Setter
    private String title;
    @Getter @Setter
    private String publishDate;
    @Getter @Setter
    private String publishTime;
    @Getter @Setter
    private String dueDate;
    @Getter @Setter
    private String dueTime;
    @Getter @Setter
    private List<Problem> probs;
    @Getter @Setter
    private Integer code;
    @Getter @Setter
    private String status;
    @Getter @Setter
    private Integer relyA, relyB;
}
