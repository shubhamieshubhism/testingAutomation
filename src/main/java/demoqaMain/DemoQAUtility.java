package demoqaMain;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class DemoQAUtility {
    public static void GenderSelection(WebDriver driver,String gender){
        List<WebElement> gederList = driver.findElements(By.xpath("//div[@class='custom-control custom-radio custom-control-inline']"));
        for(WebElement gen : gederList){
            if(gen.getText().equals(gender)){
                gen.click();
                //gen.submit();
            }
        }
    }

    public static void dateOfBirth(WebDriver driver,String month,String y,String date){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement dateip = driver.findElement(By.xpath("//input[@class='form-control']"));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@class='form-control']")));
        dateip.click();
        WebElement mons = driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']"));
        Select monlist = new Select(mons);
        monlist.selectByVisibleText(month);
        WebElement yrs = driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']"));
        Select yrlist = new Select(yrs);
        yrlist.selectByVisibleText(y);
        WebElement dt = driver.findElement(By.xpath("//div[@class='react-datepicker__month']/div[@class='react-datepicker__week']/div[.='"+date+"']"));
        dt.click();
    }

    public static void hobby(WebDriver driver,String hobby){
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        WebElement sports = driver.findElement(By.xpath("//input[@id='hobbies-checkbox-1']"));
        WebElement reading = driver.findElement(By.xpath("//input[@id='hobbies-checkbox-2']"));
        WebElement music = driver.findElement(By.xpath("//input[@id='hobbies-checkbox-3']"));
        By readingLocator = By.xpath("//input[@id='hobbies-checkbox-2']");
        By musicLocator = By.xpath("//input[@id='hobbies-checkbox-3']");

        wait.until(ExpectedConditions.elementToBeClickable(musicLocator));

        if(hobby.equals("Sports")){
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='hobbies-checkbox-1']")));
            sports.click();
        }else if(hobby.equals("Reading")){
            wait.until(ExpectedConditions.elementToBeClickable(readingLocator));
            reading.click();
        }else {
            wait.until(ExpectedConditions.elementToBeClickable(musicLocator));
            music.click();
        }
    }


}
