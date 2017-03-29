/**
 * Created by Alex on 2017/3/12.
 */
package uk.co.automatictester.jwebfwk.glue;

        import cucumber.api.java.After;
        import cucumber.api.java.Before;
        import cucumber.api.java.en.Given;
        import cucumber.api.java.en.Then;
        import cucumber.api.java.en.When;
        import uk.co.automatictester.jwebfwk.framework.ParentScenario;

        import static org.hamcrest.MatcherAssert.assertThat;
        import static org.hamcrest.core.Is.is;

public class StepDefinitions extends ParentScenario {

    @Before
    public void beforeScenario() {
//        startBrowser();
        System.out.println("This is before class");
    }

    @Given("^I am scenario (.*) for test$")
    public void I_am_a_scenario(String name) {
        System.out.println("This is scenario number: " + name);
    }

    @After
    public void afterScenario() {
//        closeBrowser();
        System.out.println("This is after class");
    }
}