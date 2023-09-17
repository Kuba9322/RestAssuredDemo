package org.example.restassured.test.videogame;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.TmsLink;
import org.example.restassured.main.pojo.videogame.VideoGame;
import org.testng.annotations.Test;

public class CreateVideoGameTest {


    @Test
    @TmsLink("ID-1")
    @Severity(SeverityLevel.CRITICAL)
    @Description("The goal of this test is to create video game")
    public void givenVideoGameWhenPostVideoGameThenVideoGameIsCreatedTest() {

        VideoGame videoGame = new VideoGame();

    }
}
