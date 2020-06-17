@login
Feature: Interview test cases

    @incorrectRegistrationNumber
    Scenario: Insufficient length registration number scenario
        Given I open the website
        When I click on log-in button
        And I click on Internet Banking
        Then I should see the login form
        When I input the registration number "12345"
        Then I should see the "Enter 8 digit registration number" error message

    @incorrectRegistrationNumber
    Scenario: Empty registration number scenario
        Given I open the website
        When I click on log-in button
        And I click on Internet Banking
        Then I should see the login form
        When I input the registration number ""
        Then I should see the "Enter 8 digit registration number" error message