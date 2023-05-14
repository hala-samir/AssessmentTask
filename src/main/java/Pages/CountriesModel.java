package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CountriesModel extends PageBase{
    public CountriesModel(WebDriver driver) {
        super(driver);
    }
    HomePage homePage;
    @FindBy(id="%s")
    WebElement countryIcon;
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

    private WebElement returnCountryIconElement(String country){
        WebElement element = driver.findElement(By.id(String.format(country,countryIcon)));
        return element;
    }

    public void selectCountryfromModel(String CountryName){
        homePage = new HomePage(driver);
        clickBtn(returnCountryIconElement(CountryName));
        wait.until(ExpectedConditions.visibilityOf(homePage.returnSelectPackageTitle()));
    }

}
