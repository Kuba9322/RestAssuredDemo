package org.example.restassured.main.rop;

import io.qameta.allure.Step;
import org.apache.http.HttpStatus;
import org.example.restassured.main.pojo.user.User;
import org.example.restassured.main.pojo.response.ApiResponse;

import java.lang.reflect.Type;

import static io.restassured.RestAssured.given;

public class CreateUserEndpoint extends BaseEndpoint <CreateUserEndpoint, ApiResponse>{
    private User user;

    @Override
    protected Type getModelType() {
        return ApiResponse.class;
    }

    @Override
    @Step("Create user")
    public CreateUserEndpoint sendRequest() {
        response = given().body(user)
                .when().post("user");
        return this;
    }

    @Override
    protected int getSuccessStatusCode() {
        return HttpStatus.SC_OK;
    }

    public CreateUserEndpoint setUser(User user) {
        this.user = user;
        return this;
    }
}
