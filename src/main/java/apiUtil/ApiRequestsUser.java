package apiUtil;

import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class ApiRequestsUser {

    private ApiRequestsUser() {
    }

    public static Response postRequestNoToken(String endpoint, Object body, int statusCode) {
        return given()
                .spec(UrlUtil.SPECIFICATION)
                .body(body)
                .when()
                .post(endpoint)
                .then()
                .log().all()
                .statusCode(statusCode)
                .extract()
                .response();
    }

    public static Response postRequest(String endpoint, Object body, int statusCode, String accessToken) {
        return given()
                .spec(UrlUtil.SPECIFICATION)
                .header("Authorization", "Bearer " + accessToken)
                .body(body)
                .when()
                .post(endpoint)
                .then()
                .log().all()
                .statusCode(statusCode)
                .extract()
                .response();
    }

    public static Response getRequest(String endpoint, int statusCode, String accessToken) {
        return given()
                .spec(UrlUtil.SPECIFICATION)
                .header("Authorization", "Bearer " + accessToken)
                .when()
                .get(endpoint)
                .then()
                .log().all()
                .statusCode(statusCode)
                .extract()
                .response();
    }

    public static Response putRequest(String endpoint, Object updateBody, int statusCode, String accessToken, String idUser) {
        return given()
                .spec(UrlUtil.SPECIFICATION)
                .header("Authorization", "Bearer " + accessToken)
                .body(updateBody)
                .when()
                .put(endpoint + idUser)
                .then()
                .log().all()
                .statusCode(statusCode)
                .extract()
                .response();
    }

    public static Response putPasswordRequest(String endpoint, Object password, int statusCode, String accessToken) {
        return given()
                .spec(UrlUtil.SPECIFICATION)
                .header("Authorization", "Bearer " + accessToken)
                .body(password)
                .when()
                .put(endpoint)
                .then()
                .log().all()
                .statusCode(statusCode)
                .extract()
                .response();
    }

    public static Response deleteRequest(String endpoint, int statusCode, String accessToken, String idUser) {
        return given()
                .spec(UrlUtil.SPECIFICATION)
                .header("Authorization", "Bearer " + accessToken)
                .when()
                .delete(endpoint + idUser)
                .then()
                .log().all()
                .statusCode(statusCode)
                .extract()
                .response();
    }

    public static Response getPostByIdRequest(String endpoint, String endpointEnd, int statusCode, String accessToken, String idUser) {
        return given()
                .spec(UrlUtil.SPECIFICATION)
                .header("Authorization", "Bearer " + accessToken)
                .when()
                .get(endpoint + idUser + endpointEnd)
                .then()
                .log().all()
                .statusCode(statusCode)
                .extract()
                .response();
    }
}
