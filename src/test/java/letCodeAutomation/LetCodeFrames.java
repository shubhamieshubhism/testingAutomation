package letCodeAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LetCodeFrames extends BeforeAndAfterSetup{
    @Test
    public void frame(){
        driver.findElement(By.xpath("//a[.=' Inner HTML ']")).click();
        WebElement firstFrame = driver.findElement(By.id("firstFr"));
        driver.switchTo().frame(firstFrame);
        driver.findElement(By.name("fname")).sendKeys("Shubham");
        driver.findElement(By.name("lname")).sendKeys("Tirpude");

        WebElement innerFrame = driver.findElement(By.xpath("//iframe[@src='innerframe']"));
        driver.switchTo().frame(innerFrame);
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("shubhamtirpude20@gmail.com");
        driver.switchTo().parentFrame();
        driver.findElement(By.name("lname")).sendKeys(" + Tirpude");

    }
}
