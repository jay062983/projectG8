Feature: Searching the employee
  Background:
    When user enters valid email and valid password
    And click on login button
    When user clicks on PIM option
  @smoke1
  Scenario: Search employee byh ID
    When user enters valid employee id
    And Clicks on search button
    And user see employee information is displayed
  @smoke1
  Scenario: Search Employee by job Title
    When user select Job Title
    And Clicks on search button
    And user see employee information is displayed