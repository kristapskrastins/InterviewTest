@Login
Feature: Interview test cases

  Background:
    Given I open the website
    When I click on log-in button
    And I click on Internet Banking
    Then I should see the login form

  @incorrectRegistrationNumber @negative
  Scenario Outline: Insufficient length registration number scenario
    When I input the registration number <input>
    Then I should see the Enter 8 digit registration number error message
    Examples: Inputting the following number combinations
      | input |
      | 12345 |
      |       |

  @correctRegistrationNumber @positive
  Scenario: Inputting the right amount of digits
    When I input the registration number 12345678
    Then I should see personal access code form