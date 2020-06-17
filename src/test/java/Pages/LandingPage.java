package Pages;

import org.openqa.selenium.By;
import static Utils.EnvironmentFactory.driver;

public class LandingPage extends BasePageObject {
    By internetBankingButton = By.xpath("//a[ text() = \"Internet Banking\"]");
    By loginButton = By.id("login");
    By loginPopup = By.cssSelector(".login-popover");

    public void clickOnLogInButton() {
        driver.findElement(loginButton).click();
        assert(driver.findElement(loginPopup).isDisplayed());
    }

    public void clickOnInternetBanking() {
        driver.findElement(internetBankingButton).click();
    }
}
