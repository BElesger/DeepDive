package com.udemy.SpringBoot.DeepDive.model;


import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;

@Data
@AllArgsConstructor
public class Survey {

    private int id;
    private String desc;
    private ArrayList<Question> questions;

}
