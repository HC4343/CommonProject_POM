package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;
import pages.LoginPage;
import utils.ConfigurationReader;
import utils.Driver;

import java.util.Hashtable;
import java.util.concurrent.TimeUnit;

public class LoginSteps {

//    WebDriver driver = null;
//    LoginPage login;
//    HomePage home;

//    @Before
//    public void browserSetup(){

//        System.setProperty("webdriver.chrome.driver", "/Users/hakancetin/IdeaProjects/CommonProject/src/test/java/drivers/chromedriver");
//        driver = new ChromeDriver();
//
//        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        driver.manage().window().maximize();
//    }

//    @After
//    public void tearDown(){
//        driver.close();
//        driver.quit();
//    }


    @Given("user is on the login page")
    public void userIsOnLoginPage() {

        String url = ConfigurationReader.get("url");
        Driver.get().get(url);
//        driver.get(url);

    }
    @When("^user enters (.*) and (.*)$")
    public void userEntersUsernameAndPasswords(String username, String password) throws InterruptedException {
       LoginPage login = new LoginPage();
//        login = new LoginPage(driver);

        login.enterUsername(username);
        Thread.sleep(1000);
        login.enterPassword(password);
        Thread.sleep(1000);

    }
    @And("user clicks on login button")
    public void userClicksOnLoginButton() throws InterruptedException {
        LoginPage login = new LoginPage();
        login.clickOnLogin();
        Thread.sleep(1000);

    }
    @Then("user is navigated to the home page")
    public void userIsNavigatedToHomePage() throws InterruptedException {
        HomePage home = new HomePage();
//        home = new HomePage(driver);
        Thread.sleep(1000);
        home.checkLogoutIsDisplayed();

    }

}
