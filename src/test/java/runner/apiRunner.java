package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.testng.CucumberOptions;
import org.junit.runner.RunWith;
import org.testng.annotations.BeforeClass;


public class apiRunner {
    @RunWith(Cucumber.class)
    @CucumberOptions(features = {"src/main/resource/feature/api"},
            glue = {"stepdefination"},
            plugin = {"com.cucumber.listener.ExtentCucumberFormatter:","pretty","html:target/cucumber-html-report","json:target/cucumber.json"},
            //plugin={"pretty:target/cucumber-htmlreport.text", "json:target/cucmber-report.json"},
            tags = "@testing11")


    public class WebRunner {

        @BeforeClass
        public  void beforeSetup() {
        }

    }
}
