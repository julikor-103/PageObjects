package maven.pages.Registration;

import maven.pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class RegistrationPage extends BasePage {

    public RegistrationPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(name = "nav")
    private WebElement headerNav;

    @FindBy(className = "login")
    private WebElement loginButton;

    @FindBy(id = "email_create")
    private WebElement emailField;
}


