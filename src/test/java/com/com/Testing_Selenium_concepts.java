package com.com;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.security.Key;
import java.time.Duration;
import java.util.List;

import static java.time.Duration.ofSeconds;

public class Testing_Selenium_concepts {
    //to print the options of the dropdown(all options)
    @Test(groups = "sanity")
    public void Testing_For_Printing_all_Elemets_of_DropDown(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://letcode.in/test");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//div[@class='card']/footer/a[.='Drop-Down']")).click();
        //List<WebElement> dropdown = driver.findElements(By.xpath("//div[@class='select is-multiple']/select/option"));
        //WebElement dd = driver.findElement(By.xpath("//select[@id='superheros']"));
        System.out.println("The List of all options of this drop down :");
        List<WebElement> list_of_option = driver.findElements(By.xpath("//select[@id='superheros']/option"));
        for(WebElement list:list_of_option){
            String lists = list.getText();
            System.out.println(lists);
        }
        driver.quit();
    }
    @Test(groups = "sanity")
    public void Alert_popup() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://letcode.in/test");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        WebElement dialog = driver.findElement(By.linkText("Dialog"));
        WebDriverWait wait = new WebDriverWait(driver, ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(dialog));
        dialog.click();
        driver.findElement(By.linkText("Simple Alert")).click();
        Thread.sleep(5000);
        driver.quit();
    }
    @Test(groups = "regression")
    public void select_Drop_Down(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://letcode.in/test");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(ofSeconds(10));
        driver.findElement(By.linkText("Drop-Down")).click();
        WebElement fruitlist = driver.findElement(By.xpath("//select[@id='fruits']"));
        fruitlist.click();
        Select fruit = new Select(fruitlist);
        fruit.selectByVisibleText("Banana");
        List<WebElement> listofsuperheroes = driver.findElements(By.xpath("//select[@id='superheros']"));

//        for(WebElement list : listofsuperheroes){
//            String nameofhero = list.getText();
//            System.out.println(nameofhero);
//        }
        for (int i = 0; i < listofsuperheroes.size(); i++) {
            System.out.println(i+1+":"+listofsuperheroes.get(i).getText());
        }
        driver.quit();
    }
    @Test(groups = "regression")
    public void frames() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://letcode.in/frame");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(ofSeconds(10));
        driver.switchTo().frame(0);
        driver.findElement(By.name("fname")).sendKeys("Shubham");
        driver.findElement(By.name("lname")).sendKeys("Tirpude");
        WebElement ineerframe = driver.findElement(By.xpath("//iframe[@src='innerFrame']"));
        driver.switchTo().frame(ineerframe);
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("shubhamtirpude@gmail.com");
        driver.switchTo().parentFrame();
        driver.findElement(By.name("fname")).sendKeys("second");
        driver.findElement(By.name("lname")).sendKeys("second");
        Thread.sleep(3000);
        driver.quit();
    }
    @Test
    public void radiobutton(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://letcode.in/radio");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(ofSeconds(10));
        driver.findElement(By.xpath("//input[@id='yes']")).click();
        driver.findElement(By.xpath("//input[@id='no']")).click();
        driver.quit();
    }
    @Test
    public void windowhandles() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://letcode.in/windows");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(ofSeconds(10));
        String main_window = driver.getWindowHandle();
        System.out.println(main_window);
        driver.findElement(By.xpath("//button[.='Open Home Page']")).click();
        Thread.sleep(2000);
        driver.switchTo().window(main_window);
    }
    @Test
    public void elements(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://letcode.in/elements");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(ofSeconds(10));
        SoftAssert soft = new SoftAssert();
        driver.findElement(By.name("username")).sendKeys("shubhamieshubhism");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        WebElement img = driver.findElement(By.cssSelector("img[alt='Placeholder image']"));
        wait.until(ExpectedConditions.visibilityOf(img));
        Assert.assertTrue(img.isDisplayed());
        System.out.println("User has a image");
        List<WebElement> listofrepo = driver.findElements(By.xpath("//ol[@type='1']/li/a[@target='_blank']"));
//        for(WebElement list : listofrepo){
//            String linkname = list.getText();
//            System.out.println(linkname);
//        }
        for (int i = 0; i < listofrepo.size(); i++) {
            String reponame = listofrepo.get(i).getText();
            System.out.println(i+1+" : "+reponame);
        }
        driver.quit();
    }
    @Test
    public void make_my_trip_calender() throws AWTException, InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.makemytrip.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(ofSeconds(10));
        Robot r = new Robot();
        r.keyPress(KeyEvent.VK_CONTROL);
        r.keyPress(KeyEvent.VK_MINUS);
        r.keyPress(KeyEvent.VK_MINUS);
        r.keyRelease(KeyEvent.VK_MINUS);
        r.keyRelease(KeyEvent.VK_CONTROL);
        driver.findElement(By.xpath("//span[@class='commonModal__close']")).click();
        driver.findElement(By.xpath("//span[.='Departure']")).click();
        String month = "November 2024";
        String day = "15";
        driver.findElement(By.xpath("//div[.='"+month+"']/ancestor::div[@class='DayPicker-Month']/descendant::p[.='"+day+"']")).click();
        Thread.sleep(5000);
        driver.quit();
    }
    @Test
    public void Amazon_input(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(ofSeconds(10));
        driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("whey protien");
        driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
        Wait wait = new FluentWait(driver).withTimeout(Duration.ofSeconds(20)).pollingEvery(Duration.ofSeconds(20)).ignoring(Exception.class);
        driver.quit();
    }

}
