package SeleniumLogics;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(features = "src/test/java/SeleniumLogics/login.feature",
        glue = "Login_steps")
public class testRunnerClass {

}
