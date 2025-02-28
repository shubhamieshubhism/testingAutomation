package letCodeAutomation;

import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.Arrays;

public class LetCodeSlider extends BeforeAndAfterSetup {
    @Test
    public void slider() throws InterruptedException {
        driver.findElement(By.xpath("//a[.=' AUI - 5 ']")).click();
        WebElement slider = driver.findElement(By.xpath("//input[@id='generate']"));
        Actions action = new Actions(driver);
        action.clickAndHold(slider).moveByOffset(50,0).release().perform();
        Thread.sleep(3000);
        WebElement slideNo = driver.findElement(By.xpath("//h1[@class='subtitle has-text-info']"));
        String sliderVisibleNo = slideNo.getText();
        System.out.println(sliderVisibleNo);
        String sliderOutputNo = sliderVisibleNo.replaceAll("[^0-9]", "");
        System.out.println(sliderOutputNo);
        driver.findElement(By.xpath("//div[.='Get Countries']")).click();
        WebElement countryClass = driver.findElement(By.xpath("//p[@class='has-text-primary-light']"));
        String listOfCountries = countryClass.getText();
        String [] seperateCountrys = listOfCountries.split(" - ");
        System.out.println("The number of sountries and capitals : "+seperateCountrys.length);

        for(String seperateCountry : seperateCountrys){
            System.out.println(seperateCountry);
        }


    }
}
