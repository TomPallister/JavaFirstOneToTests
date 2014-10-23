package domain;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by TGP on 23/10/2014.
 */
public abstract class Page {

    private WebDriver _driver;
    private WebDriverWait _webDriverWait;

    protected Page(WebDriver driver){
        _driver = driver;
        _webDriverWait = new WebDriverWait(_driver, 10);
    }

    public WebDriver Driver(){
        return _driver;
    }
    public WebDriverWait Wait(){return _webDriverWait;}
}
