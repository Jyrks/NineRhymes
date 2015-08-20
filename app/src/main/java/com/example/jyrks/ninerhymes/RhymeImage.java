package com.example.jyrks.ninerhymes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RhymeImage {

    public static int number = -1;
    public static List<String> names = Arrays.asList("kim kardashian", "simon cowell", "daniel bond");

    private final int TOTAL_IMAGES = 2;

    public RhymeImage() {
        number = (number + 1) % TOTAL_IMAGES;
    }

    public String getImageName() {
        return "image" + number;
    }
}
