package uk.co.automatictester.jwebfwk.runners;

/**
 * Created by Alex on 2017/3/12.
 */
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = "src/test/resources/features/Download.feature",
        glue = "uk.co.automatictester.jwebfwk.glue",
        format = {"pretty"})
public class DownloadFeatureRunner extends AbstractTestNGCucumberTests {
}