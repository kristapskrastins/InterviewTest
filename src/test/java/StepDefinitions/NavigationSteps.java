package StepDefinitions;


import cucumber.annotation.en.Given;
import static Utils.EnvironmentFactory.driver;

public class NavigationSteps {
    String SITE_URL = "https://aib.ie/";


    @Given("^I open the website$")
    public void iOpenTheWebsite() {
        driver.get(SITE_URL);
    }
}
