package runner;

import org.junit.runner.RunWith;

import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
		         features="src\\main\\resources\\Features",
                 glue="stepDefination")
public class TestRunner {

}
