package Practice;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

public class PracticeTakeScreenShot {


    public static void takeScreenShot(WebDriver driver,String screenShotName) throws IOException {

        //String timeStap = new SimpleDateFormat("yyyy dd MM_HHmmss").format(new Date());
        String timeStap = new SimpleDateFormat("ddMMM_HHmmss").format(new Date());
        TakesScreenshot ts = (TakesScreenshot) driver;
        File src = ts.getScreenshotAs(OutputType.FILE);
        String destPath = "screenshot/"+screenShotName+"_"+timeStap+".png";
        File dest = new File(destPath);
        FileHandler.copy(src,dest);

    }
    public static void main(String[] args) throws IOException, InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        takeScreenShot(driver,"google");
        Thread.sleep(2000);
        driver.quit();
    }
}
