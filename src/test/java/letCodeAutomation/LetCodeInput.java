package letCodeAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class LetCodeInput extends BeforeAndAfterSetup {
    @Test
    public void input(){
        driver.findElement(By.xpath("//a[.=' Edit ']")).click();
        driver.findElement(By.id("fullName")).sendKeys("Shubham Tirpude");
        driver.findElement(By.xpath("//input[@id='join']")).sendKeys(" And what about you", Keys.TAB);
        String getme = driver.findElement(By.id("getMe")).getAttribute("value");
        System.out.println(getme);
        driver.findElement(By.id("clearMe")).clear();
        boolean isEdit = driver.findElement(By.id("noEdit")).isEnabled();
        System.out.println(isEdit);
        String isReadonly = driver.findElement(By.id("dontwrite")).getAttribute("readonly");
        System.out.println(isReadonly);
    }
}
