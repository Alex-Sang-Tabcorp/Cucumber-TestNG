package Sample.runners;

/**
 * Created by Alex on 2017/3/12.
 */
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = "src/test/resources/features",
        glue = "Sample.glue",
        format = {"pretty"}
//        tags = {"@alextest"}
        )
public class FirstRunner extends AbstractTestNGCucumberTests {
}