package maven.pages;
import maven.pages.utils.BrowserFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import static maven.pages.utils.Browsers.CHROME;
import static maven.pages.utils.Browsers.FIREFOX;

//поднимаем web driver
public class BaseTest extends BrowserFactory {
    private static WebDriver driver;

    @BeforeSuite
    public static void setUp() {
        try {
//            System.setProperty("webdriver.chrome.driver", "/Users/julikor/Documents/SeleniumProject/src/test/resources/drivers/chromedriver-1");
//            driver = new ChromeDriver();
            driver = getFactoryDriver(FIREFOX);
            driver.manage().window().maximize();
        } catch (Exception e) {
            System.out.println("Some problems with drivers");
        }
    }

    @AfterSuite
    public static void tearDown() {
        driver.quit();
    }

    public static WebDriver getDriver() {
        return driver;
    }
}
