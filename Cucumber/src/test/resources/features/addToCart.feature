Feature: User can add blouse to cart.


  Scenario: User can add blouse to cart.
    Given User starts on the home page.
    When user hovers on the blouse.
    And user clicks on add to cart button.
    Then Blouse is added to the cart.


