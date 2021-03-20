package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

public class HomePage extends BasePage{


    @FindBy(id = "logout")
    WebElement btn_logout;

//    WebDriver driver;

//    public HomePage() {
//        PageFactory.initElements(Driver.get(), this);
//    }

//    public HomePage(WebDriver driver){
//        this.driver = driver;
//        PageFactory.initElements(driver,this);
//    }

    public void checkLogoutIsDisplayed(){
        btn_logout.isDisplayed();
    }


}
