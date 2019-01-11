package com.udemy.SpringBoot.DeepDive.model;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Question {
    private int id;
    private String question;
    private String answer;
}
