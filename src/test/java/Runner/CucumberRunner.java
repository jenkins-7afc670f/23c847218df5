package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        tags = "",
        features = {"src/test/resources/features"},
        glue = {"StepDefinitions"},
        plugin = { "pretty", "json:target/cucumber-reports.json" },
        monochrome = true
)

public class CucumberRunner extends AbstractTestNGCucumberTests {
    // test 4
}