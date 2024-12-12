import Object_repository.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class PomClassImplimentation {
    @Test
    public void logintothefb(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        LoginPage lp = new LoginPage(driver);
        lp.logintoapp("shubham","password");
        driver.quit();
    }

}
