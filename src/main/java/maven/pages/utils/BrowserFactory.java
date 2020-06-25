package maven.pages.utils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//HW17
public class BrowserFactory {

    public static WebDriver getFactoryDriver(Browsers browser) throws Exception {

        switch (browser) {

            case FIREFOX:
                System.setProperty("webdriver.gecko.driver", "/Users/julikor/Documents/SeleniumProject/src/test/resources/drivers/geckodriver");
                return new FirefoxDriver();
            case CHROME:
                System.setProperty("webdriver.chrome.driver", "/Users/julikor/Documents/SeleniumProject/src/test/resources/drivers/chromedriver-1");
                return new ChromeDriver();
            default:
                //System.setProperty("webdriver.chrome.driver", "/Users/julikor/Documents/SeleniumProject/src/test/resources/drivers/chromedriver-1");
                //return new ChromeDriver();
                throw new Exception("Can't find driver for browser." + browser);
        }
    }
}
