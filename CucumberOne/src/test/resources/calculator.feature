Feature: Test calculator

  Scenario: Summing with zero
    Given I test calculator
    When I add 0 and 3
    Then Result is 3

  Scenario Outline: Summing different numbers with zero for result <result>
    Given I test calculator
    When I add <num1> and <num2>
    Then Result is <result>
    Examples:
      | num1 | num2 | result |
      | 0    | 7    | 7      |
      | 0    | 0    | 0      |
      | -6   | 0    | -6     |
