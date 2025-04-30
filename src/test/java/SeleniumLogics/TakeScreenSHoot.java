package SeleniumLogics;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TakeScreenSHoot {
    public static void takingscreenshot(WebDriver driver, String screenshotname) throws IOException {
        String timestamp = new SimpleDateFormat("yyyyDDMM_HHmmss").format(new Date());
        TakesScreenshot ts = (TakesScreenshot)driver;
        File scr = ts.getScreenshotAs(OutputType.FILE);
        String destPath = "screenshot/"+screenshotname+"_"+timestamp+".png";
        File destFile = new File(destPath);
        FileHandler.copy(scr,destFile);
    }
}
