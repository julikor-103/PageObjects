package maven.pages.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Waiters {
    public static final int DEFAULT_TIME_WAIT = 5;
    public static final int TIME_THIRD = 3;
    public static final String ListItemsForClothes = "li.ajax_block_product";

    public static void implicitWait(WebDriver driver, int time, TimeUnit timeUnit) {
        driver.manage().timeouts().implicitlyWait(time, timeUnit);
    }

    public static void waitForUrlToBePresent(WebDriver driver, int maxTimeSeconds, String url) {
        WebDriverWait wait = new WebDriverWait(driver, maxTimeSeconds);
        wait.until(ExpectedConditions.urlToBe(url));
    }

    public static void waitForVisibilityByCssSelector(WebDriver driver, String selector) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(selector)));
    }

}