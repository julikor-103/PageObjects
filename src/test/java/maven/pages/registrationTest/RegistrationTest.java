package maven.pages.registrationTest;

import maven.pages.BaseTest;
import maven.pages.Registration.CreateAnAccountPage;
import maven.pages.Registration.RegistrationPage;
import maven.pages.googleSearch.GoogleResultPage;
import maven.pages.googleSearch.GoogleSearchPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.util.List;

public class RegistrationTest extends BaseTest {
    GoogleResultPage googleResultPage;
    GoogleSearchPage googleSearchPage;
    RegistrationPage registrationPage;
    CreateAnAccountPage createAnAccountPage;

    @BeforeMethod
    public void beforeMethod() {

        registrationPage = new RegistrationPage(getDriver());
        googleResultPage = new GoogleResultPage(getDriver());
        googleSearchPage = new GoogleSearchPage(getDriver());

    }

    @Test
    public void createAnAccauntTest() {
        //Given
        googleSearchPage.openGoogleSearch();
        googleSearchPage.search("automationpractice");
        googleResultPage.openUrlByName();
        registrationPage.goToRegistrationPage();
        registrationPage.registerEmail();
        //Then

        List<WebElement> list = getDriver().findElements(By.name("id_gender"));

        Boolean is_selected = list.get(0).isSelected();
        if (is_selected == true) {
            list.get(1).click();
        } else {
            list.get(0).click();
        }

        getDriver().findElement(By.id("customer_firstname")).sendKeys("value", "Julikor");
        getDriver().findElement(By.id("customer_lastname")).sendKeys("value", "Korytina");


        /*Random random = new Random();
        int n = random.nextInt(100) + 1;
        String pass = "qwerty" + n + "Q";
        System.out.println(pass);

        WebElement element = getDriver().findElement(By.id("passwd"));
        element.sendKeys("value", pass);
        getDriver().findElement(By.id("days")).sendKeys("value", "5");*/
    }
}
