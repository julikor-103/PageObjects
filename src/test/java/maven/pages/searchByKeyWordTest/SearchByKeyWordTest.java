package maven.pages.searchByKeyWordTest;
import maven.pages.BaseTest;
import maven.pages.googleSearch.GoogleResultPage;
import maven.pages.googleSearch.GoogleSearchPage;
import maven.pages.searchByKeyWord.SearchByKeyWordPage;
import maven.pages.utils.Waiters;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.util.List;

public class SearchByKeyWordTest extends BaseTest {

    GoogleResultPage googleResultPage;
    GoogleSearchPage googleSearchPage;
    SearchByKeyWordPage searchByKeyWordPage;

    @BeforeMethod
    public void beforeMethod() {
        googleResultPage = new GoogleResultPage(getDriver());
        searchByKeyWordPage = new SearchByKeyWordPage(getDriver());
        googleSearchPage = new GoogleSearchPage(getDriver());
    }

    @Test(priority = 1, groups = "smoke", description = "my second test")
    public void checkSearchByKeysWordsReturnCorrectNumberOfResultsTest() {
        //Given
        googleSearchPage.openGoogleSearch();
        googleSearchPage.search("automationpractice");
        googleResultPage.openUrlByName();
        //When
        searchByKeyWordPage.search("dress");
        //Then
        List<WebElement> menuItems = getDriver().findElements(By.cssSelector(Waiters.ListItemsForClothes));
        Assert.assertEquals(menuItems.size(), 7);
    }
}

