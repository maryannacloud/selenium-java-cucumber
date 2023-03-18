package stepdefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utilities.ConfigReader;
import utilities.DBUtils;
import utilities.DriverUtilities;
import utilities.Screenshot;

public class Hooks {
    @Before
    // adding the cucumber Scenario parameter, which will hold the data for the scenario, which is currently running
    public void setUp (Scenario scenario) {
        // initializing "properties" Object, which is also inside the ConfigReader Class
        // ConfigReader must be initialized before anything else
        ConfigReader.initializeProperties();

        // calling the .createDriver() method from the DriverUtilities Class
        DriverUtilities.createDriver(scenario);

        // calling the .initializeDBProperties() method from the DBUtils Class
        DBUtils.initializeDBProperties();
    }

    @After
    public void tearDown(Scenario scenario) {
        // using the .attach() method in order to attach our screenshot to the scenario
        // the parameters, we are passing are: the byte[] array "screenshot", which is returned by the .takeScreenshot() method, inside the CommonMethods Class
        // the media type is: image/png, because this is an image of png type
        // the name of the scenario, as the name of the image
        if (scenario.isFailed()){
            scenario.attach(Screenshot.takeScreenshot(), "image/png", scenario.getName());
        }
        Screenshot.takeScreenshot(scenario);
        DBUtils.closeDBConnection();
        DriverUtilities.quitDriver(scenario);
    }
}
