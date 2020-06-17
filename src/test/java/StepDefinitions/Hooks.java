package StepDefinitions;

import Utils.EnvironmentFactory;
import Utils.PropertyManager;
import cucumber.annotation.After;
import cucumber.annotation.Before;


public class Hooks {

    @Before()
    public void initDriver() {
        EnvironmentFactory.initDriver(PropertyManager.getInstance().getProperty("BROWSER"));
    }

    @After()
    public void deInitDriver() {
        EnvironmentFactory.deInitDriver();
    }


}
