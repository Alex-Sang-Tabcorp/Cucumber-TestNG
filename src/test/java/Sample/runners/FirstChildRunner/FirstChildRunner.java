package Sample.runners.FirstChildRunner;

/**
 * Created by Alex on 2017/3/12.
 */
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = "src/test/resources/features/FeatureList1",
        glue = "Sample.glue",
        format = {"pretty"}
//        tags = {"@FirstChildRunner"}
        )
public class FirstChildRunner extends AbstractTestNGCucumberTests {
}