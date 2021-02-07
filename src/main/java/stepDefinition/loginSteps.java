package stepDefinition;

import PageObjectModel.loginPage;
import cucumber.api.java.en.And;
import org.openqa.selenium.WebDriver;

public class loginSteps {

    PageObjectModel.loginPage loginPage = new loginPage();
    private WebDriver driver;

    @And("^Click logIn button$")
    public void ClickLogIn()
    {
        loginPage.logIn();
    }

    @And("^Write Login Email \"([^\"]*)\"$")
    public void LoginEmail(String LoginEmail)
    {
        loginPage.LoginEmail(LoginEmail);
    }

    @And("^Write Login Password \"([^\"]*)\"$")
    public void loginPass(String loginPass)
    {
        loginPage.LoginPassword(loginPass);
    }

}
