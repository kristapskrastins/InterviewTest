package Pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static Utils.EnvironmentFactory.driver;

public class BasePageObject {
    private int defaultWait = 5;

    public WebElement waitUntilVisible(By element, int timeOut){
        WebDriverWait wait = new WebDriverWait(driver, timeOut);
        return wait.until(ExpectedConditions.visibilityOfElementLocated(element));
    }

    public WebElement waitUntilVisible(By element){
       return waitUntilVisible(element,defaultWait);
    }


}
