Feature: Web Login

  Scenario: User should be able to login with valid credentials
    Given The user is on login page
    When The user enters valid credentials
    And Hits submit
    Then The user should be logged in successfully
