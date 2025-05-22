package demoqa;

import demoqaMain.DemoQAForm;
import demoqaMain.DemoQAUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.HashMap;

public class FormDemo extends DemoQAUtility {
    HashMap<String,String>formDataDemoTest = DemoQAForm.getDemoQAFormData();
    WebDriver driver;
    @BeforeTest
    public void setuP(){
        driver=new ChromeDriver();
        driver.get("https://demoqa.com/automation-practice-form");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test
    public void formDemoTest(){
        driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys(formDataDemoTest.get("FirstName"));
        driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys(formDataDemoTest.get("LastName"));
        driver.findElement(By.xpath("//input[@placeholder='name@example.com']")).sendKeys(formDataDemoTest.get("Email"));
        driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).sendKeys(formDataDemoTest.get("Mobile"));
        GenderSelection(driver,"Male");
        dateOfBirth(driver,"May","2025","20");
        //WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        WebElement subjectInput = driver.findElement(By.xpath("//input[@id='subjectsInput']"));
        //wait.until(ExpectedConditions.visibilityOf(subjectInput));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].style.display='block';", subjectInput);

        subjectInput.sendKeys(formDataDemoTest.get("Subjects"));

        hobby(driver,"Music");
        driver.findElement(By.xpath("//input[@id='uploadPicture']")).sendKeys("C:\\Users\\PALASH TIRPUDE\\Pictures\\baby goku.jpg");
        driver.findElement(By.xpath("//textarea[@placeholder='Current Address']")).sendKeys(formDataDemoTest.get("CurrentAddress"));

    }
    @AfterTest
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }
}
