package stepDefinition;

import PageObjectModel.registerPage;
import cucumber.api.java.en.Given;
import org.openqa.selenium.WebDriver;
import utilities.Driver;
import java.util.concurrent.TimeUnit;

public class RegisterSteps {

    registerPage registerPage = new registerPage();
    private WebDriver driver;

    @Given("^Navigate to Website$")
    public void navigate_to_Website() throws Throwable
    {
        driver = Driver.getDriver();
        driver.manage().window().maximize();
        driver.get("https://www.mediamarkt.com.tr/");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @Given("^Click My Account Button$")
    public void click_My_Account_Button() throws Throwable
    {
        registerPage.clickMyAccount();
    }

    @Given("^Click Register Button$")
    public void click_Register_Button() throws Throwable {

    }

    @Given("^Choose Gender$")
    public void choose_Gender() throws Throwable {

    }

    @Given("^Write \"([^\"]*)\"$")
    public void write(String arg1) throws Throwable {

    }

    @Given("^Choose Be aware of the opportunities!$")
    public void choose_Be_aware_of_the_opportunities() throws Throwable {

    }

    @Given("^Choose Privacy Policy$")
    public void choose_Privacy_Policy() throws Throwable {

    }

}
