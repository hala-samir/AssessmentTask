package stepdefinitions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;
import java.time.Duration;

public class TestBase extends AbstractTestNGCucumberTests{
    public static WebDriver driver;

    @BeforeSuite
    public void setup(){
        driver = new FirefoxDriver();
        WebDriverManager.firefoxdriver().setup();
        driver.manage().window().maximize();
        driver.navigate().to("https://subscribe.jawwy.tv/eg-en");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(70));
    }
    @AfterSuite
    public void teardown(){

        driver.quit();
    }

}
