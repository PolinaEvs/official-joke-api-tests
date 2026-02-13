Feature: Joke structure validation

  Background:
    When I request a random joke

  Scenario: Validate required fields using data table
    Then the response status should be 200
    And the response should contain fields:
      | field     |
      | id        |
      | type      |
      | setup     |
      | punchline |
