Feature: Joke by ID

  Scenario Outline: Get joke by different ids
    When I request a joke by id <id>
    Then the response status should be 200
    And the response should contain field "id"
    And the response should contain field "setup"
    And the response should contain field "punchline"

    Examples:
      | id |
      | 1  |
      | 5  |
      | 10 |
