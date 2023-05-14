package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageBase{
    public HomePage(WebDriver driver) {
        super(driver);
    }
    @FindBy(className = "mobile-hidden")
    private WebElement selectPackageTitle;
    @FindBy(id = "name-lite")
    private WebElement litePackageTitle;
    @FindBy(id = "name-classic")
    private WebElement classicPackageTitle;
    @FindBy(id = "name-premium")
    private WebElement premiumPackageTitle;
    @FindBy(id="country-btn")
    private WebElement countryButton;

    @FindBy(xpath = "//div[@class='trial-cost']")
    private WebElement trialPriceLabel;
    public WebElement returnClassicPackageTitle(){
        return classicPackageTitle;
    }

    public WebElement returnPremiumPackageTitle(){
        return premiumPackageTitle;
    }
    public WebElement returnLitePackageTitle(){
        return litePackageTitle;
    }

    public WebElement returnSelectPackageTitle(){
        return selectPackageTitle;
    }

    public boolean isSelectPageTitleDisplayed(){
        return returnSelectPackageTitle().isDisplayed();
    }

     public boolean isSelectClassicTitleDisplayed(){
        return returnClassicPackageTitle().isDisplayed();
     }
    public boolean isSelectPremiumTitleDisplayed(){
        return returnPremiumPackageTitle().isDisplayed();
    }
    public boolean isSelectLiteTitleDisplayed(){
        return returnLitePackageTitle().isDisplayed();
    }

   public void clickCountryButton(){
        clickBtn(countryButton);
   }
   public String GetPriceLabelText(){
        String s=trialPriceLabel.getText();
      return trialPriceLabel.getText();
   }
}
