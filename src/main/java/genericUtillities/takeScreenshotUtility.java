package genericUtillities;

import net.bytebuddy.asm.Advice;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class takeScreenshotUtility {
    public String TakeScreeenShot(WebDriver driver, String Screenshotname) throws IOException {
        TakesScreenshot ts = (TakesScreenshot)driver;
        File src = ts.getScreenshotAs(OutputType.FILE);
        File dst = new File(".\\screenshot\\"+Screenshotname+".png");
        Files.copy(src.toPath(), dst.toPath());
        return dst.getAbsolutePath();
    }
}
