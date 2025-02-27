package letCodeAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class LetCodeDragAndDrop extends BeforeAndAfterSetup {
    @Test
    public void drag(){
        driver.findElement(By.xpath("//a[.=' AUI - 1 ']")).click();
        Actions act = new Actions(driver);
        WebElement element = driver.findElement(By.xpath("//h3[.='I can only be dragged within the dotted container']"));
        act.dragAndDropBy(element,20,20).perform();
    }
    @Test
    public void drop() throws InterruptedException {
        driver.findElement(By.xpath("//a[.=' AUI - 2 ']")).click();
        WebElement src = driver.findElement(By.xpath("//div[@id='draggable']"));
        WebElement target = driver.findElement(By.xpath("//div[@id='droppable']"));
        Actions action = new Actions(driver);
        action.dragAndDrop(src,target).perform();
        Thread.sleep(3000);

    }

}
