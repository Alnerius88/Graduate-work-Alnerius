package ru.skypro.homework.dto;

import lombok.Data;

import java.util.ArrayList;

@Data
public class Comments {
    private Integer count;
    private ArrayList<Comment> results;
}
