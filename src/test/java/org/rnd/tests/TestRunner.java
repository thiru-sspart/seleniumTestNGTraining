package org.rnd.tests;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "stepDefs",
        plugin = {"html:target/cucumber-reports/HomePage/cucumber-pretty","json:target/json-cucumber-reports/homepage/cukejson.json",
                "testng:target/testng-cucumber-reports/HomePage/cuketestng.xml" }
)

public class TestRunner {

}
