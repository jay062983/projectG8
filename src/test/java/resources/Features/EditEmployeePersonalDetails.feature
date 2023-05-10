Feature: Edit employee contacts
  Background: : after employee login
    When user enters valid email and valid password
    Given employee has logged in using "Gmsan" and "V#c$1667!s"
    And employee clicked MyInfo tab
    @Task1
    Scenario: change employee contact details

      Then clicks on Edit button
      And changes firstname middle name and lastname
      And clicks on gender
      And employee selects Marital Status
      Then National dropdown menu

      Then user clicks on save button
