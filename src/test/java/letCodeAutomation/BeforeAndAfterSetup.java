package letCodeAutomation;

import lombok.SneakyThrows;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

public class BeforeAndAfterSetup implements ITestListener {
    WebDriver driver;
    @BeforeTest
    public void beforeTestSetup(){
        driver = new ChromeDriver();
        driver.get("https://letcode.in/test");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @AfterTest
    public void afterTestSetup() throws InterruptedException {
        Thread.sleep(4000);
        driver.quit();
    }

    @Override
    public void onStart(ITestContext context) {
        System.out.println("The testing has been successfully started");
    }

    @SneakyThrows
    @Override
    public void onTestFailure(ITestResult result) {
        takeScreenShot();
    }

    public void takeScreenShot() throws IOException {
        String timestamp = new SimpleDateFormat("yyyyDDmm_HHmmss").format(new Date());
        TakesScreenshot takesScreenshot = (TakesScreenshot)  driver;
        File src = takesScreenshot.getScreenshotAs(OutputType.FILE);
        String destPath = "screenshot/"+"Screenshot"+"_"+timestamp+".png";
        File dst = new File(destPath);
        FileHandler.copy(src,dst);
    }
}
