package letCodeAutomation;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LetCodeButton extends BeforeAndAfterSetup {
    @Test
    public void buttons(){
        //click on the button and then go back to the home page
        driver.findElement(By.xpath("//a[.=' Click ']")).click();
        driver.findElement(By.xpath("//button[.='Goto Home']")).click();
        driver.navigate().back();

        //get the location of the button
        WebElement ele = driver.findElement(By.xpath("//button[.='Find Locations']"));
        Point point = ele.getLocation();
        int xaxis = point.getX();
        int yaxis = point.getY();
        System.out.println("X-->"+xaxis+ "\nY-->"+yaxis);

        //get the color of the button
        WebElement btnColor = driver.findElement(By.xpath("//button[.='What is my color?']"));
        String buttonColor = btnColor.getCssValue("background-color");
        System.out.println("The button background color is "+buttonColor);

        //get dimensions of the rectangle
        Rectangle rect = driver.findElement(By.xpath("//button[.='How tall & fat I am?']")).getRect();
        Dimension dimension = rect.getDimension();
        int rectHeight = dimension.getHeight();
        int rectWidth = dimension.getWidth();
        System.out.println(dimension);
        System.out.println("Rectangle height -> "+rectHeight+"\nRectangle width -> "+rectWidth);

        //isDisabled
        boolean isDisabled = driver.findElement(By.xpath("//button[.='Disabled']")).isEnabled();
        System.out.println(isDisabled);

        //click and hold
        WebElement clickAndHold = driver.findElement(By.xpath("//label[.='Click and Hold Button']"));
        Actions actions = new Actions(driver);
        actions.clickAndHold(clickAndHold);

        SoftAssert sa = new SoftAssert();
        sa.assertTrue(true," Button has been long pressed");
        sa.assertAll();


    }
}
