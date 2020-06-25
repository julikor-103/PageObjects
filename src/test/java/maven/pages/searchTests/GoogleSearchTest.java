package maven.pages.searchTests;
import maven.pages.BaseTest;
import maven.pages.googleSearch.GoogleResultPage;
import maven.pages.googleSearch.GoogleSearchPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import java.util.List;
import static maven.pages.googleSearch.GoogleResultPage.URL_AUTOPRACTICE;



public class GoogleSearchTest extends BaseTest {

GoogleSearchPage googleSearchPage;
GoogleResultPage googleResultPage;

@BeforeMethod
public void beforeMethod() {
    googleSearchPage = new GoogleSearchPage(getDriver());
    googleResultPage = new GoogleResultPage(getDriver());
}
    @Test(enabled = false, groups = "regression")

    public void myFirstTest() {

        getDriver().get("https://the-internet.herokuapp.com/");
        getDriver().findElement(By.linkText("Shifting Content")).click();
        getDriver().findElement(By.partialLinkText("Example 1")).click();
        List<WebElement> menuItems = getDriver().findElements(By.tagName("li"));
        for (WebElement menu : menuItems) {
            System.out.println(menu.getText());
        }
        System.out.println("Number of menu items:" + menuItems.size());
        Assert.assertEquals("5", menuItems.size());
    }

    @DataProvider (name = "GoogleSearch")
    public Object[][] createData() {
    return new Object[][] {{"", ""}, {"", ""}, {"", ""}};
    }

    @Test(priority = 1, groups = "smoke", description = "my second test")
    public void meSecondTest() {
        //Given - передаем сетинги это как прикондишн
        googleSearchPage.openGoogleSearch();

        //When - это действия которые выполняются в тесте
        googleSearchPage.search("automationpractice");

         //And - второе действие и последующие идут как AND
       googleResultPage.openUrlByName();
          //Then - это результат

        Assert.assertEquals(getDriver().getCurrentUrl(), URL_AUTOPRACTICE, "link isn't correct");
    }
}

