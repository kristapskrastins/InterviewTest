package Pages;

import org.openqa.selenium.By;

import static junit.framework.Assert.assertEquals;
import static Utils.EnvironmentFactory.driver;

public class LoginPage extends BasePageObject {

    private By loginStepOneForm = By.id("loginstep1Form");
    private By loginPersonalAccessCodeForm = By.id("loginstep2Form");
    private By nextButton = By.id("nextButton");
    private By registrationNumberInput = By.id("regNumber_id");
    private By registrationNumberError = By.id("regNumber.errors");

    public void iShouldSeeTheLoginForm(){
        assert(waitUntilVisible(loginStepOneForm).isDisplayed());
    }

    public void iInputRegistrationNumber(String number){
        driver.findElement(registrationNumberInput).sendKeys(number);
        driver.findElement(nextButton).click();
    }

    public void iShouldSeeTheErrorWithText(String text){
        assertEquals(driver.findElement(registrationNumberError).getText(), text);
    }

    public void iShouldSeeThePersonalAccessCodeForm() {
       assert(waitUntilVisible(loginPersonalAccessCodeForm).isDisplayed());
    }
}
