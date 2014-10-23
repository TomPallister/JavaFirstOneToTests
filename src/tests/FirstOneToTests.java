package tests;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;


import domain.CreateAccountPage;
import domain.HomePage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstOneToTests {

    private WebDriver _driver;

    @Before
    public void setUp() throws Exception {
        _driver = new ChromeDriver();
    }

    @After
    public void TearDown() throws Exception {
        _driver.quit();
    }

    @Test
    public void test() {
        HomePage homePage = new HomePage(_driver, "http://www.firstoneto.com");
        CreateAccountPage createAccountPage = homePage.ClickCreateAccount();
    }
}