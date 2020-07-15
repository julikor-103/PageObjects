package maven.pages.Registration;

import maven.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class CreateAnAccountPage extends BasePage {

    public CreateAnAccountPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(name = "id_gender")
    private WebElement genderField;

    @FindBy(id = "customer_firstname")
    private WebElement customerFirstName;

    @FindBy(id = "customer_lastname")
    private WebElement customerLastName;
}

    /*List<WebElement> list = driver.findElements(By.name("id_gender"));
    Boolean is_selected = list.get(0).isSelected();
        if (is_selected == true) {
                list.get(1).click();
                } else {
                list.get(0).click();
                }
                driver.findElement(By.id("customer_firstname")).sendKeys("value", "Julikor");
                driver.findElement(By.id("customer_lastname")).sendKeys("value", "Korytina");*/