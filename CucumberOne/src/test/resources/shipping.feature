Feature: Shipping

  Scenario Outline: Shipping book
    Given A "<format>" book in Paul's cart
    When He pays for it
    Then The book should be "<shipped>"

    Examples:
      | format    | shipped                 |
      | PDF       | sent to a mobile device |
      | Audiobook | sent over email         |
      | Hardcover | shipped physically      |
      | Paperback | shipped physically      |
      | Audio CD  | shipped physically      |