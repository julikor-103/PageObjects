package maven.pages.Registration;
import maven.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.Random;

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

    @FindBy(name = "id_gender")
    private WebElement genderField;

    @FindBy(id = "SubmitCreate")
    private WebElement submitButton;


    public RegistrationPage goToRegistrationPage() {
        headerNav.click();
        loginButton.click();
        return this;
    }

    public CreateAnAccountPage registerEmail() {

        Random random = new Random();
        int n = random.nextInt(100) + 1;
        String email = "julikor" + n + "@gmail.com";
        System.out.println(email);

        genderField.sendKeys("value", email);
        submitButton.submit();
        return new CreateAnAccountPage(driver);
    }
}







