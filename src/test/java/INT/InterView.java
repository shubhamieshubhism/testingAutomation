package INT;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;

public class InterView {
    public static void takeScreenShot(WebDriver driver, String filename) throws IOException {
        TakesScreenshot ts = (TakesScreenshot) driver;
        File src = ts.getScreenshotAs(OutputType.FILE);
        File dest = new File("ScreenShots/"+filename+".png");
        FileHandler.copy(src,dest);
        System.out.println("ScreenShot saved: "+dest.getAbsolutePath());
    }
}
