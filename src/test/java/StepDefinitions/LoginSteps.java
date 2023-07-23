package StepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class LoginSteps {
    private static WebDriver driver;
    private static WebDriverWait wait;
    private ChromeOptions options;
    public final static int TIMEOUT = 10;

    @Before
    public void setUp() {
        System.out.println("OS NAME: " + System.getProperty("os.name"));
        System.out.println("CHROMEDRIVER_PATH: " + System.getProperty("CHROMEDRIVER_PATH"));
        System.out.println("BIN: " + System.getProperty("GOOGLE_CHROME_BIN"));

        options = new ChromeOptions();

        System.setProperty("webdriver.chrome.driver", "drivers\\windows\\chromedriver.exe");
//        System.setProperty("webdriver.chrome.driver", System.getenv("CHROMEDRIVER_PATH"));
//        options.setBinary(System.getenv("GOOGLE_CHROME_BIN"));

        options.addArguments("--headless=new");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--no-sandbox");
        options.addArguments("--ignore-ssl-errors=true");
        options.addArguments("--ignore-certificate-errors");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMEOUT));
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT));
    }

    @Given("I go to saucedemo website")
    public void i_go_to_saucedemo_website() {
        // Write code here that turns the phrase above into concrete actions
            driver.get("https://www.saucedemo.com/");
    }

    @When("I enter username {string} and password {string}")
    public void i_enter_username_and_password(String string, String string2) {
        // Write code here that turns the phrase above into concrete actions
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("user-name")))).sendKeys(string);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("password")))).sendKeys(string2);
    }

    @Then("I click {string} button")
    public void i_click_button(String string) {
        // Write code here that turns the phrase above into concrete actions
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("login-button")))).click();
    }
    @Then("I see products")
    public void i_see_products() {
        // Write code here that turns the phrase above into concrete actions
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//span[@class='title'][text()='Products']"))));
    }

    @After
    public void teardown() {
        driver.quit();
    }
}
