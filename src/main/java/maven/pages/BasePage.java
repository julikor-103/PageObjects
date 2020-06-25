package maven.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

//Инициализация елементов на странице (this page)

public class BasePage {

    protected WebDriver driver;

    public BasePage(WebDriver driver) {
       this.driver = driver;
       PageFactory.initElements(driver, this);
     //driver.get("http://automationpractice.com/index.php/");
    }
}
