package apiUtil;

import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class ApiRequestsPost {

    public ApiRequestsPost() {

    }

    public static Response postCreatePostRequest(String endpoint, Object post, int statusCode, String accessToken) {
        return given()
                .spec(UrlUtil.SPECIFICATION)
                .header("Authorization", "Bearer " + accessToken)
                .body(post)
                .when()
                .post(endpoint)
                .then()
                .log().all()
                .statusCode(statusCode)
                .extract()
                .response();
    }
}