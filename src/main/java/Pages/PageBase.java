package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
public class PageBase {
    public WebDriver driver;
    public JavascriptExecutor js;
    public PageBase(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public static void clickBtn(WebElement element)
    {
        element.click();
    }
    public static void clearTxt(WebElement element)
    {
        element.clear();
    }

    public static void fillTextField(WebElement element, String txt)
    {
        clearTxt(element);
        element.click();
        element.sendKeys(txt);
    }

    public void scrollDown()
    {
        js.executeScript("window.scrollBy(0,2500)");
    }

}
