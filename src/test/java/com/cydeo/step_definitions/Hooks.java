package com.cydeo.step_definitions;

//pre post conditions for each scenario and step

import com.cydeo.utilities.Driver;
import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    /*
    //import from io.cucumber.java not from junit
    //@Before (order = 1)
    public void setupScenario() {
        System.out.println("====Setting up browser using cucumber @Before");
    }

    //@Before (value = "@login", order = 2)
    public void setupScenarioForLogins() {
        System.out.println("====this will only apply to scenarios with @login tag");
    }

    //@Before (value = "@db", order = 0)
    public void setupForDatabaseScenarios() {
        System.out.println("====this will only apply to scenarios with @db tag");
    }

     */

    @After
    public void tearDownScenario(Scenario scenario) {

        if (scenario.isFailed()){
            byte[] screenShot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);

            scenario.attach(screenShot, "image/png", scenario.getName());
        }
        Driver.closeDriver();
    }

    /*

    @BeforeStep("@Student")
    public void setupStep() {
        System.out.println("------------------applying setup step");
    }

    @AfterStep
    public void afterStep() {
        System.out.println("------------------applying after step");
    }
     */


}
