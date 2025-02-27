package letCodeAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class LetCodeFindElement extends BeforeAndAfterSetup{
    @Test
    public void findElement(){
        driver.findElement(By.xpath("//a[.=' Find Elements ']")).click();
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("shubhamieshubhism");
        driver.findElement(By.xpath("//button[@id='search']")).click();
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        WebElement userImage = driver.findElement(By.xpath("//img[@src='https://avatars.githubusercontent.com/u/145760258?v=4']"));
        wait.until(ExpectedConditions.visibilityOf(userImage));
        if(userImage.isDisplayed()){
            String image = userImage.getAttribute("src");
            System.out.println("The image is displayed with source: "+image);
        }else{
            System.out.println("Image is not displayed");
        }

        SoftAssert sa = new SoftAssert();
        sa.assertTrue(userImage.isDisplayed(),"the image is not displayed");
        sa.assertNotNull(userImage.getAttribute("src"),"The attribute is not null");
        sa.assertAll();
        System.out.println("Image is displayed with source: " + userImage.getAttribute("src"));
    }
}
