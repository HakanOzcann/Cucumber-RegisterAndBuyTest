package stepDefinition;

import PageObjectModel.registerPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.openqa.selenium.WebDriver;
import utilities.Driver;

import java.util.concurrent.TimeUnit;

public class RegisterSteps
{
    registerPage registerPage = new registerPage();
    private WebDriver driver;

    @Given("^Navigate to website$")
    public void navigateToWebsite()
    {
        driver = Driver.getDriver();
        driver.manage().window().maximize();
        driver.get("https://www.mediamarkt.com.tr/");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @And("^Click My Account button$")
    public void ClickMyAccount()
    {
        registerPage.clickMyAccount();
    }

    @And("^Click Register button$")
    public void ClickRegister()
    {
        registerPage.clickRegister();
    }

    @And("^Choose Gender$")
    public void ChooseGender()
    {
        registerPage.chooseGender();
    }

    @And("^Write Firstname \"([^\"]*)\"$")
    public void firstName(String firstname)
    {
        registerPage.firstName(firstname);
    }

    @And("^Write Lastname \"([^\"]*)\"$")
    public void lastName(String lastname)
    {
        registerPage.lastName(lastname);
    }

    @And("^Write PhoneNumber \"([^\"]*)\"$")
    public void phoneNumber(String phone)
    {
        registerPage.phoneNumber(phone);
    }

    @And("^Write Email \"([^\"]*)\"$")
    public void Email(String Email)
    {
        registerPage.Email(Email);
    }

    @And("^Write Password \"([^\"]*)\"$")
    public void Password(String Password)
    {
        registerPage.Password(Password);
    }

    @And("^Write Confirm Password \"([^\"]*)\"$")
    public void ConfirmPassword(String confirmPassword)
    {
        registerPage.confirmPassword(confirmPassword);
    }

    @And("^Choose Privacy and Policy$")
    public void clickPrivacyPolicy()
    {
       registerPage.PrivacyPolicy();
    }

    @And("^Click Save button$")
    public void clickSave()
    {
        registerPage.saveButton();
    }


}
