package Utilities;

import Pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated;

public class Utils {
    WebDriver webDriver;
    public Utils(){
        this.webDriver= BasePage.webDriver;
    }

    //WebDriverWait wait = new WebDriverWait(webDriver, 10);

    public void ExpicitWait(WebElement ele)throws Exception{
        //wait.until(visibilityOfElementLocated(ele));
    }
    public void Assertion(WebElement ele,String value)throws Exception{
        Assert.assertEquals(ele.getText(),value);
    }
    public void ClickElement(WebElement ele)throws Exception{
        ExpicitWait(ele);
        ele.click();
    }
    public void EnterText(WebElement ele,String value)throws Exception{
        ExpicitWait(ele);
        ele.sendKeys(value);
    }
}
