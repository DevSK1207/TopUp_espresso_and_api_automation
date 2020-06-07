package com.example.topup;

import org.junit.Before;
import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.CoreMatchers.equalTo;

public class TopupRestAssuredTest {

    //set base url

    @Before
    public void setup(){
        RestAssured.baseURI = "http://api.dev-sheba.xyz";
    }

     //Topup history GET API check for code = 200

    @Test
    public void history_api_test_get(){
        get("/v2/affiliates/1/top-up/history?remember_token=9A61848A18FC135FD53A21358D6A3")
                .then().statusCode(200).assertThat()
                .body("code", equalTo(200));
    }


    //Topup history GET API check for code = 500

    @Test
    public void history_servererror_api_test_get(){
        get("/v2/affiliates/1/top-up/history?remember_token=9A61848A18FC135FD53A21358D6A3")
                .then().statusCode(200).assertThat()
                .body("code", equalTo(500));
    }


    //Topup history GET API check for code = 404 to set a wrong remember_token

    @Test
    public void history_unauthorized_api_test_get(){
        get("/v2/affiliates/1/top-up/history?remember_token=9A61848A18FC135FD53A21358D6A4")
                .then().statusCode(200).assertThat()
                .body("code", equalTo(404));
    }

    //Topup agent history GET API check for code = 200

    @Test
    public void agent_history_api_test_get(){
        get("/v2/affiliates/10/history?filter_type=date_range&sp_type=affiliates&from=2018-01-20&to=2018-10-30&remember_token=0T0zLQKkZFvi0xdrtR41TwduAC9S9eR0lDR31ziqNDOem0qhpRo2CZbvDLW4qg0HFSvTxnN6DOFoi505o7Buc4KD2GeX3H6LVdckszN6oOFzbrE9R2vt8KJq87kv9R2yqWB3CrkGN69PUNalh8oRDB8BFmtR6L21jhnYe91BnY55MEz4mZDmu0Tq0Uc2oMF6qmK8Nl3gJW8XBt0nGImGbBPjm9x5nOEQ7tc047PcC3maXStF45ygLYpuDlAn0VQ")
                .then().statusCode(200).assertThat()
                .body("code", equalTo(200));
    }


    //Topup agent history GET API check for code = 500

    @Test
    public void agent_history_servererror_api_test_get(){
        get("/v2/affiliates/10/history?filter_type=date_range&sp_type=affiliates&from=2018-01-20&to=2018-10-30&remember_token=0T0zLQKkZFvi0xdrtR41TwduAC9S9eR0lDR31ziqNDOem0qhpRo2CZbvDLW4qg0HFSvTxnN6DOFoi505o7Buc4KD2GeX3H6LVdckszN6oOFzbrE9R2vt8KJq87kv9R2yqWB3CrkGN69PUNalh8oRDB8BFmtR6L21jhnYe91BnY55MEz4mZDmu0Tq0Uc2oMF6qmK8Nl3gJW8XBt0nGImGbBPjm9x5nOEQ7tc047PcC3maXStF45ygLYpuDlAn0VQ")
                .then().statusCode(200).assertThat()
                .body("code", equalTo(500));
    }



    //Topup Dashboard GET API check for code = 200

    @Test
    public void dashboard_api_test_get(){
        get("/v2/affiliates/10/service-lead-status?filter_type=date_range&agent_data=1&sp_type=affiliates&from=2018-01-20&to=2018-10-30&remember_token=0T0zLQKkZFvi0xdrtR41TwduAC9S9eR0lDR31ziqNDOem0qhpRo2CZbvDLW4qg0HFSvTxnN6DOFoi505o7Buc4KD2GeX3H6LVdckszN6oOFzbrE9R2vt8KJq87kv9R2yqWB3CrkGN69PUNalh8oRDB8BFmtR6L21jhnYe91BnY55MEz4mZDmu0Tq0Uc2oMF6qmK8Nl3gJW8XBt0nGImGbBPjm9x5nOEQ7tc047PcC3maXStF45ygLYpuDlAn0VQ")
            .then().statusCode(200).assertThat()
                .body("code", equalTo(200));
    }






}
