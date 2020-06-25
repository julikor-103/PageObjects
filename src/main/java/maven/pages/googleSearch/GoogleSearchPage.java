package maven.pages.googleSearch;
import maven.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

// Работа с разными пейджами

public class GoogleSearchPage extends BasePage {

    public static final String GOOGLE_LINK = "https://www.google.com/";

    public GoogleSearchPage(WebDriver driver) {

        super(driver);
    }

    @FindBy (name = "q")
    private WebElement searchField;

    public GoogleSearchPage openGoogleSearch() {
    driver.get(GOOGLE_LINK);
    return this;
 }
   public GoogleResultPage search(String text) {
       searchField.sendKeys(text);
       searchField.submit();
       return new GoogleResultPage(driver); // возвращает RESULT PAGE переходит на нее и по цепочке начинает инициализировать элементы
   }

}
