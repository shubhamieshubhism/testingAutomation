package SeleniumLogics;

import listeners.TestListener;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import resources.FormData;

import java.time.Duration;
import java.util.HashMap;
@Listeners(TestListener.class)
public class HasmapFormTesting {
    WebDriver driver;
    @Test

    public void loginTesting() throws InterruptedException {
        HashMap<String,String>form = FormData.getFormData();
        driver=new ChromeDriver();
        driver.get("https://practicetestautomation.com/practice-test-login/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
        WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
        username.sendKeys(form.get("username"));
        password.sendKeys(form.get("password"));


        driver.findElement(By.xpath("//button[.='Submit']")).click();
        //Assert.assertTrue(driver.getTitle().contains("dashboard"),"Login failed");
        Thread.sleep(2000);
        driver.quit();
    }
}
