Feature: Order processing

  Scenario Outline: Place an order
    Given I have a "<product>"
    When I place an order for <quantity> items
    Then the order should be "<status>"

    Examples:
      | product  | quantity | status |
      | T-shirt  | 2        | shipped |
      | Mug      | 3        | pending |
      | Keychain | 1        | shipped |