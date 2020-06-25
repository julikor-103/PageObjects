package maven.pages.searchByKeyWord;

import maven.pages.BasePage;
import maven.pages.utils.Waiters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchByKeyWordPage extends BasePage {

    public SearchByKeyWordPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id="search_query_top")
    private WebElement searchInput;

    @FindBy(name="submit_search")
    private WebElement submitBtn;


    public SearchByKeyWordPage search(String text){
        searchInput.sendKeys(text);
        submitBtn.submit();
        Waiters.waitForVisibilityByCssSelector(driver, Waiters.ListItemsForClothes);
        return new SearchByKeyWordPage(driver);
   }
}

