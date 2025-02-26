package letCodeAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class LetCodeRadioButton extends BeforeAndAfterSetup{
    @Test
    public void radioButton() throws InterruptedException {
        driver.findElement(By.xpath("//a[.=' Toggle ']")).click();
        //driver.findElement(By.xpath("//input[@id='yes']")).click();//for option yes
        driver.findElement(By.xpath("//input[@id='no']")).click();//for option no

        List<WebElement> radioButtons = driver.findElements(By.xpath("//input[@name='one']"));
        for(WebElement radiobutton : radioButtons){
            radiobutton.click();
            Thread.sleep(3000);
            long selectedCount = radioButtons.stream().filter(WebElement::isSelected).count();
            if(selectedCount!=1){
                System.out.println("Test failed : more than one option is selected");
                return;
            }
        }
        System.out.println("Test passed : Only one button is selected");

        List<WebElement> fooRadioButtons = driver.findElements(By.xpath("//input[@name='foobar']"));
        for(WebElement fooRadioButton : fooRadioButtons){
            if(fooRadioButton.isSelected()){
                System.out.println("Selected radio button "+fooRadioButton.getAttribute("id"));
                break;
            }
        }

        boolean isDisabled = driver.findElement(By.xpath("//input[@id='maybe']")).isEnabled();
        System.out.println("The radio button is enable : "+isDisabled);

        WebElement checkBox = driver.findElement(By.xpath("//label[.=' Remember me ']"));
        if(checkBox.isSelected()){
            System.out.println("The checkbox is selected");
        }else{
            System.out.println("The checkbox is not selected");
        }

        WebElement tncCheckbox = driver.findElement(By.xpath("//div[@class='card-content']/descendant::div[@class='field']/label[.='Accept the T&C']/following-sibling::label[@class='checkbox']"));
        tncCheckbox.click();
    }
}
