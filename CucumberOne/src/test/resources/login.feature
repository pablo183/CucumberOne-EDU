Feature: Application Login



  @RegTest
  Scenario: Home page default login
    Given User on NetBanking loading page
    When User login into application with "pawel" and password "4321"
    Then Home page is populated
    And Cards displayed are "true"

  @MobileTest
  Scenario: Home page default login
    Given User on NetBanking loading page
    When User login into application with "asna" and password "4433"
    Then Home page is populated
    And Cards displayed are "false"

  @RegTest
  Scenario Outline: Home page default login
    Given User on NetBanking loading page
    When User login into application with <Username> and password <password>
    Then Home page is populated
    And Cards displayed are "true"

    Examples:
    |Username|password|
    |user1    |pass1   |
    |user2    |pass2   |
    |user3    |pass3   |
    |user4    |pass4   |
    |user5    |pass5   |
    |user6    |pass6   |