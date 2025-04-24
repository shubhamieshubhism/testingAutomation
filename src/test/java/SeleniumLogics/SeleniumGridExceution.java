package SeleniumLogics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class SeleniumGridExceution {
    @Parameters("browser")
    @Test
    public void gridTest(String browser) throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        switch (browser.toLowerCase()){
            case "chrome":
                caps.setBrowserName("chrome");
                break;
            case "firefox":
                caps.setBrowserName("firefox");
                break;
            case "edge":
                caps.setBrowserName("edge");
            default:
                throw new IllegalArgumentException("Browser doesn't support "+browser);
        }
        //Connect to the Selenium Grid hub
        WebDriver driver = new RemoteWebDriver(new URL("//address or localhost for selenium grid"),caps);
        driver.get("website");
        System.out.println("The title "+driver.getTitle());
        driver.quit();
    }
}
