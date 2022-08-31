package Runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "html:target/cucumber-report.html",
                "rerun:target/rerun.txt", //store failed scenario names into rerun.txt file
                "json:target/cucumber.json" //generate json execution report to be used for html report
        },
      //  features = "src/resources/Features/test",
        features = "src/resources/Features/test",
        glue = "StepDefinitions",
        dryRun = false ,   //false=> run the test. true => check for missing steps
        tags = "@amazon"
)


public class CukesRunner {
}
