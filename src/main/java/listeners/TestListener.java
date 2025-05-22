package listeners;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import genericUtillities.ExtentManager;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Test;


public class TestListener implements ITestListener {
    private static final ExtentReports extent = ExtentManager.getExtentRepots();
    private static ThreadLocal<ExtentTest> testLog=new ThreadLocal<>();

    @Override
    public void onTestStart(ITestResult result) {
        ExtentTest test = extent.createTest(result.getMethod().getMethodName());
        testLog.set(test);
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        testLog.get().pass("Test Passed");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        testLog.get().fail("Test Fail");

    }

    @Override
    public void onFinish(ITestContext context) {
        extent.flush();
    }
}
