package stepdefination;

import Pages.BasePage;
import Pages.Flow;
import Pages.PageObject;
import Utilities.ConfigFileReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class WebStepDef {
    WebDriver webDriver;
    ConfigFileReader configFileReader;
    Flow flow;
    private PageObject pageObject;

    public WebStepDef(){
        BasePage.createDriver("Chrome");
        configFileReader = new ConfigFileReader();
        pageObject = new PageObject(webDriver);
        flow=new Flow();
        this.webDriver=BasePage.webDriver;

    }
    @Given("I navigate to login page {string}")
    public void i_navigate_to_login_page(String str) {
        webDriver.get(configFileReader.getApplicationUrl(str));
    }
    @When("I enter username and password {string} {string}")
    public void i_enter_username_and_password(String username, String password)throws Exception {
      flow.EnterCredentials(username,password);
    }

    @And("I click login button")
    public void iClickLoginButton()throws Exception {
        flow.ClickLogin();
    }

    @And("I click add to cart")
    public void iClickAddToCart() throws Exception {
        flow.AddToCart();
    }

    @And("I view Cart")
    public void iViewCart()throws Exception {
        flow.Viewcart();
    }

    @And("I click checkout")
    public void iClickCheckout() throws Exception{
        flow.CheckOut();
    }

    @And("I enter customer details {string} {string} {string}")
    public void iEnterCustomerDetails(String firstname, String lastname, String postalcode)throws Exception {
        flow.EnterCustomerDetails(firstname,lastname,postalcode);
    }

    @And("I click continue")
    public void iClickContinue()throws Exception {
        flow.ClickContinue();
    }

    @And("I click finish button")
    public void iClickFinishButton()throws Exception {
        flow.ClickFinish();
    }

    @And("I assert the results {string}")
    public void iAssertTheResults(String value)throws Exception {
        flow.Asserting(value);
    }

    @Then("I logout Application")
    public void i_logout_application()throws Exception {
        flow.logout();
    }
}
