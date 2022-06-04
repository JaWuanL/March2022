Feature: Feature tests login functionality.

  Scenario Outline: Check login is successful with valid credentials
    Given user is on login page
    When user enters <username> and <password>
    And clicks login button
    Then user is navigated to the home page

    Examples: 
      | username | password | status  |
      | name1    | pass1    | success |

