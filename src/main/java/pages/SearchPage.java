package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchPage extends BasePage {
    public SearchPage(WebDriver driver) {
        super(driver);
    }

    private final By searchTextField = By.id("twotabsearchtextbox");
    private final By searchButton = By.id("nav-search-submit-button");
    private final  By firstElement = By.xpath("//div[@data-component-type=\"s-search-result\"][1]");
    private final By addToCartButton = By.id("add-to-cart-button");
    private final By declineOption= By.xpath("//input[@aria-labelledby='attachSiNoCoverage-announce']");

    private final By cartIcon = By.xpath("(//span[@class='nav-cart-icon nav-sprite'])[1]");
    private final By cartContainer = By.id("sc-subtotal-label-activecart");

    public void sendTextToSearchFor(String text) {
        driver.findElement(searchTextField).sendKeys(text);
        driver.findElement(searchButton).click();
    }

    public void addFirstElementToCart()  {
        driver.findElement(firstElement).click();
        driver.findElement(addToCartButton).click();
        driver.findElement(declineOption).click();
        driver.findElement(cartIcon).click();
        /*
        WebElement cart = driver.findElement(cartIcon2);
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", cart);
        */
    }
    public String getTextFromCart() {
        return driver.findElement(cartContainer).getText();
    }

}
