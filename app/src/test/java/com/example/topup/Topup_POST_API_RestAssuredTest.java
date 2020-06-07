package com.example.topup;

import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

import static org.hamcrest.CoreMatchers.equalTo;

public class Topup_POST_API_RestAssuredTest {

    //set base url

    @Before
    public void setup(){
        RestAssured.baseURI = "http://api.dev-sheba.xyz";
    }


    //check for code = 200



    @Test
    public void topup_post_api(){
        RequestSpecification request = RestAssured.given();

        HashMap<String,String> requestParams = new HashMap<>();

        requestParams.put("remember_token","8Ovw4ZYun1QNsAjkpAs5MFgdLdnJuL2GkFQAYyifjGHzZ6ArMm40MWCEddg3NTh1sYbG7BoMoaCIxb1Mbp6jSzw4MvdEIi4hscI9fzG2muiFuzjejm0Uc0JlAoBCZfsq4MBEi6IFVZAsGhhK8fEXWON1ywUSi4ZDxAnfJX9I4uOa97MyW2ONadEzeFN992f6DWdjuB1sACt4u7DTNfPFne884QeQBPvVDqgJdIwRk8JsJc4eh2GVQxvi2uirOjt");
        requestParams.put("mobile","01768359152");
        requestParams.put("vendor_id","4");
        requestParams.put("connection_type","postpaid");
        requestParams.put("amount","10");

        request.header("Content-Type", "application/json");
        request.body(requestParams.toString());

        request.post("/v2/affiliates/24/top-up").then()
                .statusCode(200);
    }

    //check for code = 500 (server error)

    @Test
    public void topup_post_api_server_error(){
        RequestSpecification request = RestAssured.given();

        HashMap<String,String> requestParams = new HashMap<>();

        requestParams.put("remember_token","8Ovw4ZYun1QNsAjkpAs5MFgdLdnJuL2GkFQAYyifjGHzZ6ArMm40MWCEddg3NTh1sYbG7BoMoaCIxb1Mbp6jSzw4MvdEIi4hscI9fzG2muiFuzjejm0Uc0JlAoBCZfsq4MBEi6IFVZAsGhhK8fEXWON1ywUSi4ZDxAnfJX9I4uOa97MyW2ONadEzeFN992f6DWdjuB1sACt4u7DTNfPFne884QeQBPvVDqgJdIwRk8JsJc4eh2GVQxvi2uirOjt");
        requestParams.put("mobile","01768359152");
        requestParams.put("vendor_id","4");
        requestParams.put("connection_type","postpaid");
        requestParams.put("amount","10");

        request.header("Content-Type", "application/json");
        request.body(requestParams.toString());

        request.post("/v2/affiliates/24/top-up")
                .then().statusCode(200).assertThat()
                .body("code", equalTo(500));
    }

    //check for code = 400 (Authentication token is missing from the request)


    @Test
    public void topup_post_api_Authentication_missing(){
        RequestSpecification request = RestAssured.given();

        HashMap<String,String> requestParams = new HashMap<>();

        //requestParams.put("remember_token","8Ovw4ZYun1QNsAjkpAs5MFgdLdnJuL2GkFQAYyifjGHzZ6ArMm40MWCEddg3NTh1sYbG7BoMoaCIxb1Mbp6jSzw4MvdEIi4hscI9fzG2muiFuzjejm0Uc0JlAoBCZfsq4MBEi6IFVZAsGhhK8fEXWON1ywUSi4ZDxAnfJX9I4uOa97MyW2ONadEzeFN992f6DWdjuB1sACt4u7DTNfPFne884QeQBPvVDqgJdIwRk8JsJc4eh2GVQxvi2uirOjt");
        requestParams.put("mobile","01768359152");
        requestParams.put("vendor_id","4");
        requestParams.put("connection_type","postpaid");
        requestParams.put("amount","10");

        request.header("Content-Type", "application/json");
        request.body(requestParams.toString());

        request.post("/v2/affiliates/24/top-up")
                .then().statusCode(200).assertThat()
                .body("code", equalTo(400));
    }

    //check for code = 404 (User not found)


    @Test
    public void topup_post_api_user_not_found(){
        RequestSpecification request = RestAssured.given();

        HashMap<String,String> requestParams = new HashMap<>();

        requestParams.put("remember_token","8Ovw4ZYun1QNsAjkpAs5MFgdLdnJuL2GkFQAYyifjGHzZ6ArMm40MWCEddg3NTh1sYbG7BoMoaCIxb1Mbp6jSzw4MvdEIi4hscI9fzG2muiFuzjejm0Uc0JlAoBCZfsq4MBEi6IFVZAsGhhK8fEXWON1ywUSi4ZDxAnfJX9I4uOa97MyW2ONadEzeFN992f6DWdjuB1sACt4u7DTNfPFne884QeQBPvVDqgJdIwRk8JsJc4eh2GVQxvi2uirOjt");
        requestParams.put("mobile","01768359152");
        requestParams.put("vendor_id","4");
        requestParams.put("connection_type","postpaid");
        requestParams.put("amount","10");

        request.header("Content-Type", "application/json");
        request.body(requestParams.toString());

        request.post("/v2/affiliates/24/top-up")
                .then().statusCode(200).assertThat()
                .body("code", equalTo(404));
    }


}

