package cucumberTest;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resource/Test.feature",
        glue = "cucumberTest",
        plugin = {"pretty",
                "html:target/cucumber-reports/cucumber6ndTest.html",
                "json:target/cucumber-reports/cucumber6ndTest.json",
                "junit:target/cucumber-reports/cucumber6ndTest.xml"},
        monochrome = true
)
public class TestTestRunner {


}

