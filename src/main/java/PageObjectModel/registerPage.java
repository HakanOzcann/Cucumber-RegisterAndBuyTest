package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import sun.java2d.Spans;
import utilities.Driver;


public class registerPage extends AbstractClass {

    private WebDriver driver;

    public registerPage()
    {
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "#rise-header > div > div > div:nth-child(5) > div > div > span > button > span.ms-login-logout__button-label")
    private WebElement myAccount;

    public void clickMyAccount()
    {
        clickFunction(myAccount);
    }

}
