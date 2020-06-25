package maven.pages.googleSearch;
import maven.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Wait;

import java.util.concurrent.TimeUnit;

import static maven.pages.utils.Waiters.*;

// Инициализации элементов по цепочке

public class GoogleResultPage extends BasePage {

    public GoogleResultPage(WebDriver driver) {
        super(driver);

    }

    public static final String SITE_LINK_ELEMENT = "Automation Practice";
    public static final String URL_AUTOPRACTICE = "http://automationpractice.com/index.php";

    @FindBy(partialLinkText = SITE_LINK_ELEMENT)
    private WebElement siteLink;

    public void openUrlByName(){
        //waitForElementToBePresent();
        implicitWait(driver, DEFAULT_TIME_WAIT, TimeUnit.SECONDS);
        siteLink.click();
        waitForUrlToBePresent(driver, DEFAULT_TIME_WAIT, URL_AUTOPRACTICE);
    }
}
