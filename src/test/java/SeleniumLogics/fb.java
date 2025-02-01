package SeleniumLogics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.*;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.List;

public class fb {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://en-gb.facebook.com/r.php");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        takeScreenShot(driver,"ss");
        WebElement dropdown = driver.findElement(By.xpath("//select[@name='birthday_month']"));
        Select dd = new Select(dropdown);
        List<WebElement> options = dd.getOptions();
        for(WebElement option:options){
            System.out.println(option.getText());
        }

//        Wait <WebDriver> wait = new FluentWait<>(driver).withTimeout(Duration.ofSeconds(10)).pollingEvery(Duration.ofSeconds(10)).ignoring(Exception.class);
//        WebDriverWait exwait = new WebDriverWait(driver,Duration.ofSeconds(10));
//        exwait.until(ExpectedConditions.visibilityOf((WebElement) By.id("abc")));

    }

    public static void takeScreenShot(WebDriver driver, String screenShotName){
        String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
        TakesScreenshot ts = (TakesScreenshot) driver;
        File src = ts.getScreenshotAs(OutputType.FILE);
        String destPath = "screenshot/"+screenShotName+"_"+timeStamp+".png";
        File destFile = new File(destPath);
        try{
            FileHandler.copy(src,destFile);
            System.out.println("screenshot saved at "+destPath);
        }catch (IOException e){
            System.out.println("Screenshot is fail to save"+e.getMessage());
        }
    }
}
