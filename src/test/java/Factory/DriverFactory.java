package Factory;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;

public class DriverFactory {

    WebDriver driver;

    public WebDriver driverInitialization() {

        String browser = System.getProperty("browser", "CHROME");
        switch (browser) {
            case "CHROME" -> driver = new ChromeDriver();
            case "FIREFOX" -> driver = new FirefoxDriver();
            default -> driver = new SafariDriver();
        }

        Dimension browserDim = new Dimension(1024, 768);
        driver.manage().window().setSize(browserDim);

        driver.get("https://www.amazon.eg/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));


        return driver;
    }
}
