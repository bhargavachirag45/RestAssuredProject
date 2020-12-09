Feature: Validation of RestAssured Script for Negative Scenario Assertion

  Scenario: Validate response status code using Assertion-atleast 2 assertions
    Given API foreign exchange
    When posted with correct Information
    Then validate response status code received

