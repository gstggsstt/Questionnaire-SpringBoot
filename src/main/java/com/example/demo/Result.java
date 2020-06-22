package com.example.demo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
public class Result {
    @Getter @Setter
    private int code;
    @Getter @Setter
    private int formCode;
}
