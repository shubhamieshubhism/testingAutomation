package POMTests;

import Object_repository.OrangeHRMLoginPage;
import genericUtillities.takeScreenshotUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.io.IOException;
import java.time.Duration;

public class OrangeHRMPOMTestClass {
    @Test
    public void OrangeHRM() throws InterruptedException, IOException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        OrangeHRMLoginPage ohlp= new OrangeHRMLoginPage(driver);
        ohlp.LoginToOrangeHRMApp("Admin","admin123");
        WebElement validation = driver.findElement(By.xpath("//span[@class='oxd-topbar-header-breadcrumb']"));
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(validation));
        takeScreenshotUtility ts = new takeScreenshotUtility();
        ts.TakeScreeenShot(driver,"Screenshot2");
        Thread.sleep(4000);
        driver.quit();
    }

}
