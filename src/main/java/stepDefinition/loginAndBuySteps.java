package stepDefinition;

import PageObjectModel.loginAndBuyPage;
import cucumber.api.java.en.And;
import org.openqa.selenium.WebDriver;

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

}
