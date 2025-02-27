package letCodeAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class LetCodeWindows extends BeforeAndAfterSetup{
    @Test
    public void windows() throws InterruptedException {
        driver.findElement(By.xpath("//a[.=' Tabs ']")).click();
        String parentWindow = driver.getWindowHandle();
        driver.findElement(By.xpath("//button[@id='home']")).click();
        Set<String> windowHandles = driver.getWindowHandles();
        List<String>list = new ArrayList<>(windowHandles);
        //driver.switchTo().window(list.get(1));
        Thread.sleep(3000);
        driver.switchTo().window(list.get(0));
        System.out.println(driver.getCurrentUrl());
        driver.findElement(By.xpath("//button[.='Muiltiple windows']")).click();
        Set<String> windowHandles2 = driver.getWindowHandles();
        for(String handles:windowHandles2){
            driver.switchTo().window(handles);
            System.out.println("The window title is : "+driver.getTitle());
            if(!handles.equals(parentWindow)){
                driver.close();
            }
        }
        driver.switchTo().window(parentWindow);
    }
}
