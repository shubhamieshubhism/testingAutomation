package genericUtillities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ExtentManager {
    private static final ExtentReports extent = new ExtentReports();

    static {
        String timeStsmp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMdd_HHmmss"));
        String reportPath = "test-output/ExtentReport" + timeStsmp + ".html";
        ExtentSparkReporter extentspark = new ExtentSparkReporter(reportPath);

        extent.attachReporter(extentspark);
    }

    public static ExtentReports getExtentRepots() {
        return extent;
    }
}
