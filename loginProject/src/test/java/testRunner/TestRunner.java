package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/Feature/loginpage.feature", // Update this path as per your directory structure
    glue = { "stepDefinition" }, // Update to the correct package name
    plugin = { "pretty", "html:target/cucumber-html-report" },
    monochrome = true
)
public class TestRunner {
}
