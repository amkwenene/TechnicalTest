package Pages;

import Utilities.Utils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Flow {
    WebDriver webDriver;
    PageObject pageObject;
    Utils utils;

    public Flow(){
        this.webDriver=BasePage.webDriver;
        pageObject=new PageObject(webDriver);
        utils= new Utils();
    }


    public void EnterCredentials(String username,String password)throws Exception{
        utils.EnterText(pageObject.username,username);
        utils.EnterText(pageObject.password,password);
        }
    public void ClickLogin()throws Exception{
        utils.ClickElement(pageObject.loginbutton);
    }
    public void AddToCart()throws Exception{
        utils.ClickElement(pageObject.addcartbag);
    }
    public void Viewcart()throws Exception{
        utils.ClickElement(pageObject.viewcart);
    }
    public void CheckOut()throws Exception{
        utils.ClickElement(pageObject.checkout);
    }
    public void EnterCustomerDetails(String firstname,String lastname,String postalcode)throws Exception{
        utils.EnterText(pageObject.firstname,firstname);
        utils.EnterText(pageObject.lastName,lastname);
        utils.EnterText(pageObject.postalCode,postalcode);
    }
   public void ClickContinue()throws Exception{
        utils.ClickElement(pageObject.Continue);
   }
   public void ClickFinish()throws Exception{
        utils.ClickElement(pageObject.finish);
   }
   public void Asserting(String value)throws Exception{
     utils.Assertion(pageObject.Assert,value);
   }
   public void logout()throws Exception{
        utils.ClickElement(pageObject.react);
        utils.ClickElement(pageObject.logout);
   }
}
