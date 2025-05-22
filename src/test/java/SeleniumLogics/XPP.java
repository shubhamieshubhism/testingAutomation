package SeleniumLogics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class XPP {
    WebDriver driver;
    @BeforeTest
    public void setUp(){
        driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @AfterTest
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }

    @Test
    public void pathSelection(){
        driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("iphone");
        driver.findElement(By.id("nav-search-submit-button")).click();
        List<WebElement> titles = driver.findElements(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']/div/a/h2/span"));
        System.out.println("The first title --> "+titles.get(0).getText());
        if(!titles.isEmpty()){
            for(WebElement title:titles){

                System.out.println(title.getText());
            }

        }

    }
}
