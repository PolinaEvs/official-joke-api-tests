package api;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class JokeClient {

    private static final String BASE_URL = "https://official-joke-api.appspot.com";

    public Response getRandomJoke() {
        return RestAssured
                .given()
                .baseUri(BASE_URL)
                .when()
                .get("/random_joke");
    }

    public Response getJokeById(int id) {
        return RestAssured
                .given()
                .baseUri(BASE_URL)
                .when()
                .get("/jokes/" + id);
    }
}
