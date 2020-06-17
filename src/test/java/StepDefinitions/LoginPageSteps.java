package StepDefinitions;

import Pages.LoginPage;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;

public class LoginPageSteps {
   LoginPage loginPage = new LoginPage();

    @Then("^I should see the login form$")
    public void iClickOnInternetBanking() {
        loginPage.iShouldSeeTheLoginForm();
    }

    @When("^I input the registration number \"(.*)\"$")
    public void iInputTheRegistrationNumber(String number) {
        loginPage.iInputRegistrationNumber(number);
    }

    @Then("^I should see the \"(.*)\" error message$")
    public void iShouldSeeTheErrorMessage(String message) {
        loginPage.iShouldSeeTheErrorWithText(message);
    }
}
