package stepDefinition;

import PageObjectModel.loginAndBuyPage;
import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.en.And;
import org.openqa.selenium.WebDriver;
import utilities.Driver;

public class loginAndBuySteps {

    loginAndBuyPage loginAndBuyPage = new loginAndBuyPage();
    private WebDriver driver;

    @And("^Click logIn Button$")
    public void ClickLogIn()
    {
        loginAndBuyPage.logIn();
    }

    @And("^Write Login Email \"([^\"]*)\"$")
    public void LoginEmail(String LoginEmail)
    {
        loginAndBuyPage.LoginEmail(LoginEmail);
    }

    @And("^Write Login Password \"([^\"]*)\"$")
    public void loginPass(String loginPass)
    {
        loginAndBuyPage.LoginPassword(loginPass);
    }

    @And("^Click Login Button$")
    public void LoginButton()
    {
        loginAndBuyPage.loginButton();
    }

    @And("^Search Product \"([^\"]*)\"$")
    public void searchProduct(String searchProduct)
    {
        loginAndBuyPage.Search(searchProduct);
    }

    @And("^Click Search Button$")
    public void searchButton ()
    {
        loginAndBuyPage.SearchButton();
    }

    @And("^Select Lowest by Price$")
    public void selectLowest()
    {
        loginAndBuyPage.selectLowestPrice();
    }

    @And("^Click Buy Product Button$")
    public void Buy()
    {
        loginAndBuyPage.BuyProduct();
    }

    @And("^Click Complete the Order Button$")
    public void Order()
    {
        loginAndBuyPage.CompleteOrder();
    }

    @And("^Click Continue Button$")
    public void Continue()
    {
        loginAndBuyPage.ContinueOrder();
    }

    @And("^Write Home Address \"([^\"]*)\"$")
    public void writeHomeAddress(String writeHomeAddress)
    {
        loginAndBuyPage.WriteHomeAddress(writeHomeAddress);
    }

    @And("^Write Door Number \"([^\"]*)\"$")
    public void Door(String doorNumber)
    {
        loginAndBuyPage.DoorNumber(doorNumber);
    }

    @And("^Choose City$")
    public void ChooseCity()
    {
        loginAndBuyPage.RemoteOptions();
    }

    @After
    public void quitDriver() throws InterruptedException
    {
        Driver.closeDriver();
    }


}
