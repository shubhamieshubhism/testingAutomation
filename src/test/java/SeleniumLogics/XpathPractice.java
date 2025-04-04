package SeleniumLogics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class XpathPractice {

    @Test
    public void tableXpath() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/maps/@20.7715116,78.6063702,14z?authuser=0&entry=ttu&g_ep=EgoyMDI1MDMyNS4xIKXMDSoASAFQAw%3D%3D");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement searchBar = driver.findElement(By.xpath("//input[@class='fontBodyMedium searchboxinput xiQnY ']"));
        searchBar.sendKeys("Restaurants");
        driver.findElement(By.id("searchbox-searchbutton")).click();
        driver.findElement(By.xpath("//a[@class='hfpxzc']")).click();
        driver.findElement(By.xpath("//span[@class='puWIL hKrmvd google-symbols OazX1c']")).click();

        //List<WebElement> dayList = driver.findElements(By.xpath("//table[@class='eK4R0e fontBodyMedium']/tbody/tr/td[1]"));
        List<WebElement> dayList = driver.findElements(By.xpath("//table[@class='eK4R0e fontBodyMedium']/tbody/tr/td"));
//        for(int i = 0; i < dayList.size(); i++){
//            System.out.println(dayList.get(i).getText());
//            for(int j = i+1 ; j<2; j++){
//                List<WebElement> otherdata = driver.findElements(By.xpath("//table[@class='eK4R0e fontBodyMedium']/tbody/tr/td[" + i + 1 + "]"));
//                System.out.println(otherdata.get(j).getText());
//
//            }
//        }
        for(WebElement day : dayList){
            System.out.println(day.getText());
        }
        Thread.sleep(3000);
        driver.quit();

    }
}
