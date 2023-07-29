package base;

import Factory.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.SearchPage;
import pages.TodayDealsPage;

public class BaseTest {
    protected SearchPage searchPage;
    protected TodayDealsPage todayDealsPage;
    private WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new DriverFactory().driverInitialization();
        searchPage = new SearchPage(driver);
        todayDealsPage = new TodayDealsPage(driver);
    }

    @AfterMethod
    public void tearDown() {
       // driver.quit();
    }


}
