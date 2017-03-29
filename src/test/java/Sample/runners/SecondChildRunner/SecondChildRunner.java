package Sample.runners.SecondChildRunner;

/**
 * Created by Alex on 2017/3/12.
 */
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = "src/test/resources/features/FeatureList2",
        glue = "Sample.glue",
        format = {"pretty"}
//        tags = {"@SecondChildRunner"}
)
public class SecondChildRunner extends AbstractTestNGCucumberTests {
}