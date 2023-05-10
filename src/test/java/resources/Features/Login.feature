Feature: Login Functionalities
  Scenario: valid Admin login
    When user enters valid email and valid password
    And click on login button
    Then user is logged in successfully
