package cucumberTest;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class TestStepDefination {
    WebDriver driver;
    SoftAssert soft = new SoftAssert();
    @Before
    public void setUp(){
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @After
    public void tearDown() throws InterruptedException {

        Thread.sleep(2000);
        driver.quit();
    }

    @Given("user is on login page")
    public void user_is_on_login_page() {
        driver.get("https://practicetestautomation.com/practice-test-login/");
    }

    @Given("login page is loaded successfully")
    public void login_page_is_loaded_successfully() {

    }

    @When("enter valid credentials")
    public void enter_valid_credentials() {
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("student");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Password123");
        driver.findElement(By.xpath("//button[.='Submit']")).click();
    }

    @Then("user should be redirected to dashboard")
    public void user_should_be_redirected_to_dashboard() {
        WebElement successfulMsg = driver.findElement(By.xpath("//p[@class='has-text-align-center']"));
        String actualValue = "Congratulations student. You successfully logged in!";
        String expectedValue = successfulMsg.getText();
        soft.assertEquals(actualValue,expectedValue);
        soft.assertAll();

        driver.findElement(By.xpath("//a[.='Log out']")).click();
    }

    @When("when invalid credentials are entered")
    public void when_invalid_credentials_are_entered() {
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("student");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Password13");
        driver.findElement(By.xpath("//button[.='Submit']")).click();
    }

    @Then("user should see an error message")
    public void user_should_see_an_error_message() {
        WebElement Error = driver.findElement(By.xpath("//div[@id='error']"));
        String expectedError = Error.getText();
        String actualError="Your password is invalid!";
        soft.assertEquals(actualError,expectedError);
        soft.assertAll();


    }


}
