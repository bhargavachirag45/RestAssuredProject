Feature: Validation of response code using assertion

  Scenario: validating response using at least two assertions
    Given API for foreign exchange
    When passed valid values from get method
    Then validate the response received from the response body
