package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import stepdefinitions.TestBase;

@CucumberOptions(
        features = "src/test/resourses/features/HomeTests.feature",
        glue = {"stepdefinitions"},
        plugin = {"pretty",
                "html:target/cucumber-html-report"},
        tags = "@test",
        monochrome = true
)
public class HomeTestRunner extends TestBase {
}
