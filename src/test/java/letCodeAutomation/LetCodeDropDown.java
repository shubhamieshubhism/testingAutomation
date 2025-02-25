package letCodeAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class LetCodeDropDown extends BeforeAndAfterSetup {
    @Test
    public void dropDown(){
        driver.findElement(By.xpath("//a[.=' Drop-Down ']")).click();
        WebElement dropDown = driver.findElement(By.xpath("//select[@id='fruits']"));
        Select myFruit = new Select(dropDown);
        myFruit.selectByVisibleText("Apple");

        //using by visible text
        WebElement mySuperherosdd = driver.findElement(By.id("superheros"));
        Select mySuperHero = new Select(mySuperherosdd);

        //using by value
        mySuperHero.selectByValue("am");

        //get the last option form the list
        WebElement programmingLanguage = driver.findElement(By.xpath("//select[@id='lang']"));
        Select myLanguage = new Select(programmingLanguage);
        List<WebElement> programmingOptions = myLanguage.getOptions();
        programmingOptions.get(programmingOptions.size()-1).click();
        for(WebElement po : programmingOptions){
            System.out.println(po.getText());
        }

        WebElement myCountry = driver.findElement(By.id("country"));
        Select myCountryOptions = new Select(myCountry);
        myCountryOptions.selectByValue("India");

        WebElement selectedCountry = myCountryOptions.getFirstSelectedOption();
        System.out.println("the selected country is - "+selectedCountry.getText());



    }
}
