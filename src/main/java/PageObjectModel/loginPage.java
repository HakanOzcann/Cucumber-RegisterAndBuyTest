package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class loginPage extends AbstractClass {

        private WebDriver driver;

        public loginPage() {
            driver = Driver.getDriver();
            PageFactory.initElements(driver, this);
        }

        @FindBy(xpath = "//*[@id=\"rise-header\"]/div/div/div[5]/div/div/div/div/div/div[1]/a")
        private WebElement logIn;

        public void logIn()
        {
            clickFunction(logIn);
        }

        @FindBy(id = "login-email")
        private WebElement loginEmail;

        public void LoginEmail(String LoginEmail)
        {
            sendKeysFunction(loginEmail,LoginEmail);
        }

        @FindBy(id = "login-password")
        private WebElement loginPassword;

        public void LoginPassword(String LoginPassword)
        {
        sendKeysFunction(loginPassword,LoginPassword);
        }
}

