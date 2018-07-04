Feature: Form automation
  As an student I want to navigate to the test form
  Fill it and submit

  Scenario Outline: Form submit
    Given user navigates to the app url
    When user fills first name with value "<firstName>"
    And user fills last name with value "<lastName>"
    And user fills date of birth with value "<dateOfBirth>"
    And user click submit button
    Then form is submitted

    Examples:
      | firstName | lastName  | dateOfBirth |
      | Sergii    | Opanasiuk | 02/05/1988  |
      | Bill      | Murray    | 09/21/1950  |
      | Hugh      | Laurie    | 06/11/1959  |




