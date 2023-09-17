package org.example.restassured.main.rop;

import io.qameta.allure.Step;
import org.apache.http.HttpStatus;
import org.example.restassured.main.pojo.videogame.VideoGame;
import org.example.restassured.main.request.configuration.RequestConfigurationBuilder;

import java.lang.reflect.Type;

import static io.restassured.RestAssured.given;

public class CreateVideoGameEndpoint extends BaseEndpoint<CreateVideoGameEndpoint, VideoGame> {

    private VideoGame videoGame;

    @Override
    protected Type getModelType() {
        return VideoGame.class;
    }

    @Override
    @Step("Create Video Game")
    public CreateVideoGameEndpoint sendRequest() {
        response = given().spec(RequestConfigurationBuilder.getDefaultRequestSpecification()).body(videoGame)
                .when().post("api/videogame");
        return this;
    }

    @Override
    protected int getSuccessStatusCode() {
        return HttpStatus.SC_OK;
    }

    public CreateVideoGameEndpoint setVideoGame(VideoGame videoGame) {
        this.videoGame = videoGame;
        return this;
    }
}

