package StepDefinitions;

import Pages.LandingPage;
import cucumber.annotation.en.And;
import cucumber.annotation.en.When;


public class LandingPageSteps {
    LandingPage landingPage = new LandingPage();

    @When("^I click on log-in button$")
    public void iClickOnLogInButton()  {
        landingPage.clickOnLogInButton();
    }

    @And("^I click on Internet Banking$")
    public void iClickOnInternetBanking() {
        landingPage.clickOnInternetBanking();
    }
}
