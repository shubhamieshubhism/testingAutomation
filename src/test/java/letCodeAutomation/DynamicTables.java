package letCodeAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.thread.IThreadWorkerFactory;

import java.time.Duration;
import java.util.List;

public class DynamicTables {
    @Test
    public void dynamicTable() throws InterruptedException {
        WebDriver driver =  new ChromeDriver();
        driver.get("https://practice.expandtesting.com/dynamic-table");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        List<WebElement> rows = driver.findElements(By.xpath("//table[@class='table table-striped']/tbody/tr"));
        for(int r = 1 ; r < rows.size() ; r++){
            WebElement name = driver.findElement(By.xpath("//table[@class='table table-striped']/tbody/tr[" + r + "]/td[1]"));
            if(name.getText().equals("Chrome")){
                String cpuLoad = driver.findElement(By.xpath("//td[normalize-space()='Chrome']/following-sibling::*[contains(text(),'%')]")).getText();
                String value = driver.findElement(By.xpath("//p[@id='chrome-cpu']")).getText();
                if(value.contains(cpuLoad)){
                    System.out.println("The cpu load and value are equal");
                }else{
                    System.out.println("The cpu load and value are not equal");
                }
            }
            break;
        }
        Thread.sleep(3000);
        driver.quit();
    }
}
