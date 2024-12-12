package SeleniumLogics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class fb {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://en-gb.facebook.com/r.php");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement dropdown = driver.findElement(By.xpath("//select[@name='birthday_month']"));
        Select dd = new Select(dropdown);
        List<WebElement> options = dd.getOptions();
        for(WebElement option:options){
            System.out.println(option.getText());
        }
    }
}
