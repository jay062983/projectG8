Feature: Add employee work experience
  Background: : after employee login
    Given employee has logged in
    And employee clicked MyInfo tab

  @Task2
  Scenario: Add employee work experience
    When Employee clicks on Qualifications
    And user clicks on add work experience button
    Then user enters previous company name
    And user enters previous job title

    And user enters start date
    Then user Enters End date

    Then user leaves comments in the comment box

    Then user clicks on workExperience save button