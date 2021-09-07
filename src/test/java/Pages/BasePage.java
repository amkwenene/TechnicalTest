package Pages;

import org.apache.commons.exec.util.StringUtils;
import org.openqa.selenium.WebDriver;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    public static WebDriver webDriver;

    public BasePage(WebDriver webDriver) {
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver,this);

    }
    //create driver
    public static void createDriver(String driver) {
        if(driver.equalsIgnoreCase("Chrome")) {
            System.setProperty("webdriver.chrome.driver","src/main/resources/Drivers/chromedriver.exe");
            ChromeOptions options = new ChromeOptions();
            options.setExperimentalOption("useAutomationExtension",false);
            webDriver = new ChromeDriver(options);
            webDriver.manage().window().maximize();
            webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        }if(driver.equalsIgnoreCase("jjjjjj")) {
            System.setProperty("webdriver.chrome.driver","src/main/resources/drivers/chromedriver.exe");
            ChromeOptions options = new ChromeOptions();
            options.setExperimentalOption("useAutomationExtension",false);
            webDriver = new ChromeDriver(options);
            webDriver.manage().window().maximize();
            webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        }
    }
}
