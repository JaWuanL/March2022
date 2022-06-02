Feature: User is able to view Blouse detailed page.

  Scenario: User clicks on blouse to view details.
    Given User is on the home page.
    And scrolls down to new arrivals.
    When user clicks on the blouse.
    Then a detailed view of the blouse is displayed.
