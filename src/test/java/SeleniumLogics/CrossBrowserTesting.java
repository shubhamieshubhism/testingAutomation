package SeleniumLogics;

import Object_repository.BrowserFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTesting {
    WebDriver driver;
    @Parameters("browser")
    @Test
    public void testGoogle(String browser){
        driver = BrowserFactory.getDriver(browser);
        driver.get("https://www.google.com/");
        System.out.println("Title "+ driver.getTitle());
    }

    @AfterMethod
    public void tearDown(){
        if(driver!=null){
            driver.quit();
        }
    }
}
