package SeleniumLogics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;

public class DatePickers {


    static void selectMonthAndYearAndDate(WebDriver driver,String month, String year, String date){
        while (true) {
            String currentmonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();//Return month
            String currentyesr = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();//Return actual year from application
            if(currentmonth.equals(month) && currentyesr.equals(year)){
                break;
            }
            driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
        }

        //Selecting date
        List<WebElement> allDates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td//a"));
        for(WebElement dt:allDates)
        {
            if(dt.getText().equals(date)){
                dt.click();
                break;
            }
        }
    }


    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://jqueryui.com/datepicker/");
        driver.manage().window().maximize();
        //Switch the frame
        driver.switchTo().frame(0);
        //Method ! Using sendkeus()
        //driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("04/05/2024");
        //Method 2 : Using Date Picker

        //Expected data
        String year = "2025";
        String month = "May";
        String date = "20";
        driver.findElement(By.xpath("//input[@id='datepicker']")).click();
        selectMonthAndYearAndDate(driver,month,year,date);

        driver.quit();
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfAllElements((WebElement) By.xpath("abc")));
        FluentWait<WebDriver>fluentwait=new FluentWait<>(driver).withTimeout(Duration.ofSeconds(10)).pollingEvery(Duration.ofDays(3)).ignoring(NoSuchElementException.class);

        Actions act = new Actions(driver);



    }
}

