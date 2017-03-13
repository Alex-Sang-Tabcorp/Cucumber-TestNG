package uk.co.automatictester.jwebfwk.runners;

/**
 * Created by Builder on 3/13/2017.
 */
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = "src/test/resources/features/FeatureList2/",
        glue = "uk.co.automatictester.jwebfwk.glue",
        format = {"pretty"})

public class SecondRunner extends AbstractTestNGCucumberTests {
}