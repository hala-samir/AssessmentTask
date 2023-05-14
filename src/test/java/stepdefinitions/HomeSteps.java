package stepdefinitions;

import Pages.CountriesModel;
import Pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class HomeSteps extends TestBase {
    HomePage homePage;
    CountriesModel countriesModel;

    @Given("user is in home page")
    public void userIsInHomePage(){
        homePage = new HomePage(driver);
        Assert.assertTrue(homePage.isSelectPageTitleDisplayed(),"Title is not displayed");
    }
    @Then("user can view different packages types")
    public void userCanViewDifferentPackagesTypes(){
        homePage = new HomePage(driver);
        Assert.assertTrue(homePage.isSelectPremiumTitleDisplayed(), "premium package is not displayed");
        Assert.assertTrue(homePage.isSelectLiteTitleDisplayed(), "lite package is not displayed");
        Assert.assertTrue(homePage.isSelectClassicTitleDisplayed(), "classic package is not displayed");
    }


    @When("user opens countries popup")
    public void userOpensCountriesPopup() {
        homePage = new HomePage(driver);
        homePage.clickCountryButton();
    }

    @And("user selects {string}")
    public void userSelects(String country) {
        countriesModel = new CountriesModel(driver);
        countriesModel.selectCountryfromModel(country);
    }

    @Then("the correct {string} is displayed")
    public void theCorrectIsDisplayed(String currency) {
        homePage = new HomePage(driver);
        Assert.assertTrue(homePage.GetPriceLabelText().contains(currency));
    }
}
