package lessons.lesson16;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.util.List;
import java.util.Random;
//HW14

public class BaseTest {
    public WebDriver driver;
    public WebDriverWait wait;

    @BeforeMethod
    public void setUp() {
       // System.setProperty("webdriver.chrome.driver", "/Users/julikor/Documents/SeleniumProject/src/test/resources/chromedriver");
        driver = new ChromeDriver();
        //driver = new FirefoxDriver();
        wait = new WebDriverWait(driver, 10);
        driver.get("http://automationpractice.com/index.php/");
    }

    @AfterMethod
    public void closeBrowser() {
        driver.close();
    }

    @Test
    public void checkTileAfterRedirectToLoginPage() throws InterruptedException {
        goToRegistrationPage();
        String title = driver.getTitle();
        wait.until(ExpectedConditions.titleIs("Login - My Store"));
        Assert.assertEquals(title, "Login - My Store");
    }

    @Test
    public void checkSearchByKeysWordsTitleTest() {
        goToSearchByKeyWord();

        String titleSearch = driver.getTitle();

        Assert.assertEquals(titleSearch, "Search - My Store");
    }


    @Test
    public void checkSearchByKeysWordsReturnCorrectNumberOfResultsTest() {
        goToSearchByKeyWord();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("li.ajax_block_product")));

        List<WebElement> menuItems = driver.findElements(By.cssSelector("li.ajax_block_product"));
        for (WebElement menu : menuItems) {
            System.out.println(menu.getText());
        }

        System.out.println("Number of menu items:" + menuItems.size());

        Assert.assertEquals(menuItems.size(), 7);

    }

    @Test
    public void createAnAccauntTest() {
        goToRegistrationPage();

        RegisterEmail();

        List<WebElement> list = driver.findElements(By.name("id_gender"));
        Boolean is_selected = list.get(0).isSelected();
        if (is_selected == true) {
            list.get(1).click();
        } else {
            list.get(0).click();
        }
        driver.findElement(By.id("customer_firstname")).sendKeys("value", "Julikor");
        driver.findElement(By.id("customer_lastname")).sendKeys("value", "Korytina");


        Random random = new Random();
        int n = random.nextInt(100) + 1;
        String pass = "qwerty" + n + "Q";
        System.out.println(pass);

        WebElement element = driver.findElement(By.id("passwd"));
        element.sendKeys("value", pass);
        driver.findElement(By.id("days")).sendKeys("value", "5");
    }

    private void goToSearchByKeyWord() {
        driver.findElement(By.id("search_query_top")).sendKeys("Dress");
        driver.findElement(By.name("submit_search")).click();
    }

    private void goToRegistrationPage() {
        WebElement header = driver.findElement(By.className("nav"));
        header.findElement(By.className("login")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email_create")));
    }

    private void RegisterEmail() {
        {
            Random random = new Random();
            int n = random.nextInt(100) + 1;
            String email = "julikor" + n + "@gmail.com";
            System.out.println(email);

            WebElement element = driver.findElement(By.id("email_create"));
            element.sendKeys("value", email);

            driver.findElement(By.id("SubmitCreate")).click();
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("id_gender")));
        }
    }
}
