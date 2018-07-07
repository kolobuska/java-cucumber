Feature: Form automation
  As a user I want to fill my form
  also I submit it

  Scenario Outline: Form filling and submition
    Given user navigates to the app url
    When user fills first name with value "<firstname>"
    And user fills last name with value "<lastName>"
#    And user fills date of birth
#    And user fills gender
#    And user fills email
#    And user fills company
#    And user fills password
#    And user fills address
#    And user submit form
    Then form is submitted

    Examples:
      | firstname | lastName  |
      | Nick      | Jackson   |
      | Sergii    | Opanasiuk |
      | Benson    | Kamary    |



