package org.example.restassured.main.rop;

import io.qameta.allure.Step;
import org.apache.http.HttpStatus;
import org.example.restassured.main.pojo.response.ApiResponse;
import org.example.restassured.main.request.configuration.RequestConfigurationBuilder;

import java.lang.reflect.Type;

import static io.restassured.RestAssured.given;

public class DeleteVideoGameEndpoint extends BaseEndpoint<DeleteVideoGameEndpoint, ApiResponse> {

    private Integer videoGameId;

    @Override
    protected Type getModelType() {
        return ApiResponse.class;
    }

    @Override
    @Step("Delete Video Game")
    public DeleteVideoGameEndpoint sendRequest() {
        response = given().spec(RequestConfigurationBuilder.getDefaultRequestSpecification())
                .when().delete("/api/videogame/{videoGameId}", videoGameId);
        return this;
    }

    @Override
    protected int getSuccessStatusCode() {
        return HttpStatus.SC_OK;
    }

    public DeleteVideoGameEndpoint setVideoGameId(Integer videoGameId) {
        this.videoGameId = videoGameId;
        return this;
    }
}
