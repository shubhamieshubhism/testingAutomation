package com.com;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.reactivex.rxjava3.functions.Action;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class makeMyTripFlightBooking {
   @Test
    public void makeMyTrip() throws AWTException {
       WebDriverManager.chromedriver().setup();
       WebDriver driver = new ChromeDriver();
       driver.get("https://www.makemytrip.com/");
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
       Robot r = new Robot();
       r.keyPress(KeyEvent.VK_CONTROL);
       r.keyPress(KeyEvent.VK_MINUS);
       r.keyPress(KeyEvent.VK_MINUS);
       r.keyRelease(KeyEvent.VK_CONTROL);
       r.keyRelease(KeyEvent.VK_MINUS);

       //wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("body"))).click();
       driver.findElement(By.xpath("//span[@class=\"commonModal__close\"]")).click();





    }
}
