package TestRunners;

import cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@Cucumber.Options(format={"pretty","html:reports/test-report"},
        glue = "StepDefinitions",
        features = "login.feature",
        tags= "@Login")
public class TestRunner {
}
