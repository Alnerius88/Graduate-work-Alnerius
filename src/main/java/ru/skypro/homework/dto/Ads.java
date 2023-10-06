package ru.skypro.homework.dto;

import lombok.Data;

import java.util.ArrayList;

@Data
public class Ads {
    private Integer count;
    private ArrayList<Ad> results;
}
