package steps;

import api.JokeClient;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;

import static org.junit.jupiter.api.Assertions.*;

public class JokeSteps {

    private final JokeClient jokeClient = new JokeClient();
    private Response response;

    @When("I request a random joke")
    public void requestRandomJoke() {
        response = jokeClient.getRandomJoke();
    }

    @When("I request a joke by id {int}")
    public void requestJokeById(int id) {
        response = jokeClient.getJokeById(id);
    }

    @Then("the response status should be {int}")
    public void verifyStatus(int statusCode) {
        assertEquals(statusCode, response.getStatusCode());
    }

    @Then("the response should contain field {string}")
    public void verifyFieldExists(String fieldName) {
        assertNotNull(response.jsonPath().get(fieldName));
    }
}
