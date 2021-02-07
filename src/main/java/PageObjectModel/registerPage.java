package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class registerPage extends AbstractClass {

    private WebDriver driver;

    public registerPage() {
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"rise-header\"]/div/div/div[5]/div/div/span/button")
    private WebElement myAccount;

    public void clickMyAccount()
    {
        clickFunction(myAccount);
    }

    @FindBy(xpath = "//*[@id=\"rise-header\"]/div/div/div[5]/div/div/div/div/div/div[2]/ul/li[1]/a")
    private WebElement register;

    public void clickRegister()
    {
        clickFunction(register);
    }

    @FindBy(id = "tqa_register_personTitleMr")
    private WebElement gender;

    public void chooseGender()
    {
        clickFunction(gender);
    }

    @FindBy(id = "register-firstname")
    private WebElement firstname;

    public void firstName(String firstName)
    {
        sendKeysFunction(firstname, firstName);
    }

    @FindBy(id = "register-lastname")
    private WebElement lastname;

    public void lastName(String lastName)
    {
        sendKeysFunction(lastname, lastName);
    }

    @FindBy(id = "phone2")
    private WebElement phone;

    public void phoneNumber(String phoneNumber)
    {
        sendKeysFunction(phone, phoneNumber);
    }

    @FindBy(id = "register-email")
    private WebElement email;

    public void Email(String Email)
    {
        sendKeysFunction(email, Email);
    }

    @FindBy(id = "register-password")
    private WebElement password;

    public void Password(String Password)
    {
        sendKeysFunction(password,Password);
    }

    @FindBy(id = "register-password-confirm")
    private WebElement confirmPass;

    public void confirmPassword(String confirmPassword)
    {
        sendKeysFunction(confirmPass,confirmPassword);
    }
    @FindBy(id = "policy-acceptance")
    private WebElement privacyPolicy;

    public void PrivacyPolicy()
    {
        scrollUpDown();
        clickFunction(privacyPolicy);
    }

    @FindBy(id = "my-account-register-submit")
    private WebElement save;

    public void saveButton()
    {
        clickFunction(save);
    }



}







