package letCodeAutomation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LetCodeAlert extends BeforeAndAfterSetup{
    @Test
    public void alert() throws InterruptedException {
        driver.findElement(By.xpath("//a[.=' Dialog ']")).click();

        //accepting an alert
        driver.findElement(By.xpath("//button[.='Simple Alert']")).click();
        Alert simpleAlert = driver.switchTo().alert();
        simpleAlert.accept();


        //dismissing the alert
        driver.findElement(By.xpath("//button[.='Confirm Alert']")).click();
        Alert confirmAlert = driver.switchTo().alert();
        System.out.println(confirmAlert.getText());
        confirmAlert.dismiss();

        //Type your name & accept
        driver.findElement(By.xpath("//button[.='Prompt Alert']")).click();
        Alert promtAlert = driver.switchTo().alert();
        promtAlert.sendKeys("Shubham");
        SoftAssert sa = new SoftAssert();
        sa.assertTrue(true,"Your name is: shubham");
        sa.assertAll();
        Thread.sleep(5000);

        System.out.println(promtAlert.getText());
        promtAlert.accept();
    }

}
