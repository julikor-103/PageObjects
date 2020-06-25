/*
package lessons.lesson16.lessons17;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertEquals;

public class Locators {
    private WebDriver driver;

    @Test
    public void myFirstTest() {
        System.setProperty("webdriver.chrome.driver", "/Users/julikor/Documents/SeleniumProject/src/test/resources/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        driver.findElement(By.linkText("Shifting Content")).click();
        driver.findElement(By.partialLinkText("Example 1")).click();
        List<WebElement> menuItems = driver.findElements(By.tagName("li"));
        for (WebElement menu : menuItems) {
            System.out.println(menu.getText());
        }
        System.out.println("Number of menu items:" + menuItems.size());
        Assert.assertEquals("5", menuItems.size());
        driver.quit();
    }


@Test
public void meSecondTest() {
    System.setProperty("webdriver.chrome.driver", "/Users/julikor/Documents/SeleniumProject/src/test/resources/chromedriver");
    driver = new ChromeDriver();
    WebDriverWait wait = new WebDriverWait(driver, 10);

    driver.get("https://www.google.com/");
    driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

    WebElement searchField = driver.findElement(By.name("q"));
    searchField.sendKeys("automatoinpractice");
    searchField.submit();

    WebElement siteLink = driver.findElement(By.partialLinkText("Automation Practice"));
    siteLink.click();

    wait.until(ExpectedConditions.urlToBe("http://automationpractice.com/index.php"));
    Assert.assertEquals(driver.getCurrentUrl(), "http://automationpractice.com/index.php", "link isn't correct");

    driver.close();
    }
    @Test
    //(description = "due to bug", enabled = false, priority = 1, qroup = "smoke", dataProvider = "")
    private void  thirdTest(){
        System.setProperty("webdriver.chrome.driver", "/Users/julikor/Documents/SeleniumProject/src/test/resources/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://www.google.com/");
    }
}
*/
