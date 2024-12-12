package SeleniumLogics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.time.Duration;

public class loginPageUsingDataProvider {
    @Test(dataProvider = "LoginData")
    public void login(String username, String password){
        WebDriver driver = new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.xpath("//input[@class='email']")).sendKeys(username);
        driver.findElement(By.xpath("//input[@class='password']")).sendKeys(password);
        driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();


        boolean loginstatus;
        try{
            loginstatus=driver.findElement(By.xpath("//a[.='Log out']")).isDisplayed();
            Assert.assertTrue(loginstatus);
        } catch (Exception e) {
            loginstatus=false;
            Assert.assertTrue(loginstatus);
        }finally {
            driver.quit();
        }
    }

    @DataProvider(parallel = true)
    public String[][]LoginData(){
        String[][] data = {
                {"shubhamtirpude20@gmail.com", "Shubham@20" },
                {"ShubhamTirpude20@gmail.com", "123" },
                {"shubham", "1234" }
        };
        return data;
    }
}
