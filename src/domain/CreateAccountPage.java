package domain;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * Created by TGP on 23/10/2014.
 */
public class CreateAccountPage extends Page {

    private By _userNameLocator = By.id("username");

    public CreateAccountPage(WebDriver driver){
        super(driver);
        Wait().until(ExpectedConditions.visibilityOfElementLocated(_userNameLocator));
    }
}
