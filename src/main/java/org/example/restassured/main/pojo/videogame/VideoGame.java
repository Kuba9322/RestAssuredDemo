package org.example.restassured.main.pojo.videogame;

import org.example.restassured.main.constants.enums.Category;
import org.example.restassured.main.constants.enums.Rating;

import java.util.Date;

public class VideoGame {

    int videoGameId;

    Category category;

    Rating rating;

    Date releaseDate;

    int reviewScore;
}
