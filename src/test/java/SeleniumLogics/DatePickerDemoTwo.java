package SeleniumLogics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class DatePickerDemoTwo {
    static void selectMDY(WebDriver driver,String month, String year, String date){

        while(true) {
            String currentmonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
            String currentyear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
            if(currentmonth.equals(month)&&currentyear.equals(year)){
                break;
            }
            driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
        }
        
        //Selecting date
        List<WebElement> dates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td/a"));
        for(WebElement dt : dates){
            if(dt.getText().equals(date)){
                dt.click();
                break;
            }
        }

    }

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://jqueryui.com/datepicker/");
        driver.manage().window().maximize();
        driver.switchTo().frame(0);
        String year = "2026";
        String month = "May";
        String date = "20";
        driver.findElement(By.xpath("//input[@id='datepicker']")).click();

        selectMDY(driver,month,year,date);
        driver.quit();



    }
}
