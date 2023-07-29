package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class TodayDealsPage extends BasePage{
    public TodayDealsPage(WebDriver driver) {
        super(driver);
    }
    private final By todayDealsButton = By.linkText("عروض اليوم");
    private final By groceryIcon = By.xpath("//body[1]/div[1]/div[19]/div[1]/div[1]/div[1]/div[2]/div[2]/span[3]/ul[1]/li[14]/label[1]/input[1]");
    private final By phoneIcon = By.xpath("//body[1]/div[1]/div[19]/div[1]/div[1]/div[1]/div[2]/div[2]/span[3]/ul[1]/li[13]/label[1]/input[1]");
    private final By discountTenOrMore = By.xpath("//*[@data-csa-c-element-id='filter-discount-10-']");



    private final By selectAnyElement = By.xpath("//div[@aria-label='الصفقة: وفر على Osterberg والمزيد; سعر الصفقة: خصم يصل إلى %17']//img[@alt='وفر على Osterberg والمزيد']");
    private final By nthProduct = By.cssSelector("");

    private final By addToCartButton = By.id("add-to-cart-button");

    public void todaySelection(){
        driver.findElement(todayDealsButton).click();
        driver.findElement(groceryIcon).click();
        driver.findElement(phoneIcon).click();

        WebElement discount = driver.findElement(discountTenOrMore);
        Actions actions = new Actions(driver);
        actions.moveToElement(discount).click().build().perform();

        driver.findElement(selectAnyElement).click();
        driver.findElement(addToCartButton).click();
    }



}
