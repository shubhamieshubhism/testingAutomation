package Xpath_Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Xpath_Demo_One {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.opencart.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //Xpath with single attribute
        //driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("Tshirt");

        //Xpath with multiple attributes
        // //input[@name='search'][@placeholder='Search']

        driver.findElement(By.xpath("//input[@name='search'][@placeholder='Search']")).sendKeys("Tshirt");

        //Xpath with AND OR operator
        //input[@name='search' and @placeholder='Search']





    }
}
