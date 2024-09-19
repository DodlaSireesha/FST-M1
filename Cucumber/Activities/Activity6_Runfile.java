package Test_Runner_Files;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
	features = "FEATURES",
	glue = {"Step_Definitions"},
    tags = "@activity6",
    plugin = {"json: test-reports/json-report.json"},
    monochrome = true
)


	public class Activity6_Runfile {
}
