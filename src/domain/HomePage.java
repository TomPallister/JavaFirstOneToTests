package domain;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.List;

/**
 * Created by TGP on 23/10/2014.
 */
public class HomePage extends Page {

    private By _logInLocator = By.id("ember348");
    private By _createAccountLocator = By.id("ember355");

    public HomePage(WebDriver driver, String url){
        super(driver);
        Driver().get(url);
    }

    public LoginPage ClickLogIn(){
        Driver().findElement(_logInLocator).click();
        return new LoginPage(Driver());
    }

    public CreateAccountPage ClickCreateAccount(){
        Driver().findElement(_createAccountLocator).click();
        return new CreateAccountPage(Driver());
    }

    public PlayerPage ClickLogInWithFacebook() throws Exception {
        List<WebElement> elements = Driver().findElements(By.className("btn"));
        for (int i = 0; i < elements.size(); i++) {
            if(elements.get(i).getText().contains("Facebook")){
                elements.get(i).click();
                return new PlayerPage(Driver());
            }
        }
        throw new Exception("Could not click Log in with Facebook button");
    }
}
