package org.example.restassured.test.testbase;

import io.qameta.allure.restassured.AllureRestAssured;
import io.restassured.RestAssured;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import org.aeonbits.owner.ConfigFactory;
import org.example.restassured.main.propierties.EnvironmentConfig;
import org.example.restassured.main.request.configuration.RequestConfigurationBuilder;
import org.testng.annotations.BeforeSuite;

public class SuiteTestBase {

    @BeforeSuite
    public void setupConfiguration(){
        EnvironmentConfig environmentConfig = ConfigFactory.create(EnvironmentConfig.class);
        RestAssured.basePath = environmentConfig.basePath();
        RestAssured.baseURI = environmentConfig.baseUri();
        RestAssured.filters(new RequestLoggingFilter(), new ResponseLoggingFilter(), new AllureRestAssured());


        RestAssured.requestSpecification = RequestConfigurationBuilder.getDefaultRequestSpecification();
    }
}

