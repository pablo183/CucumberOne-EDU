Feature: Application Login

  @SmokeTest
  Scenario: Home page default login
    Given User on NetBanking loading page
    When User login into application with "pawel" and password "4321"
    Then Home page is populated
    And Cards displayed are "true"
