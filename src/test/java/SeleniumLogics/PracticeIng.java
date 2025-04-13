package SeleniumLogics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class PracticeIng {
    WebDriver driver;

    @Test
    public void setup() throws InterruptedException {
        driver = new ChromeDriver();
        driver.navigate().to("https://www.google.com/");
        WebElement appButton = driver.findElement(By.xpath("//a[@aria-label='Google apps']"));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(appButton));
        //driver.findElement(By.cssSelector("textarea[id='APjFqb']")).sendKeys("med");
        //driver.findElement(By.cssSelector("input[value='Google Search']")).click();
        Thread.sleep(2000);
        driver.quit();
    }
}
