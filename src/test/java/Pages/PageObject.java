package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObject {
    private WebDriver driver;
    public PageObject(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);

    }


    @FindBy(name = "user-name")
    public WebElement username;
    @FindBy(name = "password")
    public WebElement password;
    @FindBy(name = "login-button")
    public WebElement loginbutton;
    @FindBy(name = "add-to-cart-sauce-labs-backpack")
    public WebElement addcartbag;
    @FindBy(xpath = "//*[@class='shopping_cart_badge']")
    public WebElement viewcart;
    @FindBy(name = "checkout")
    public WebElement checkout;
    @FindBy(name = "firstName")
    public WebElement firstname;
    @FindBy(name = "lastName")
    public WebElement lastName;
    @FindBy(name = "postalCode")
    public WebElement postalCode;
    @FindBy(name = "continue")
    public WebElement Continue;
    @FindBy(name = "finish")
    public WebElement finish;
    @FindBy(xpath = "//*[@class='complete-header']")
    public WebElement Assert;
    @FindBy(xpath = "//*[@id='react-burger-menu-btn']")
    public WebElement React;
    @FindBy(xpath = "//*[@id='react-burger-menu-btn']")
    public WebElement react;
    @FindBy(id = "logout_sidebar_link")
    public WebElement logout;













}
