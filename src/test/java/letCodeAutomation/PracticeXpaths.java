package letCodeAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;
public class PracticeXpaths {
    @Test
    public void Points(){
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Point img = driver.findElement(By.xpath("//input[@placeholder='Search Amazon.in']")).getLocation();
        int xaxis = img.getX();
        int yaxis = img.getY();

        System.out.println("X-->"+xaxis+"\nY-->"+yaxis);
    }


}
