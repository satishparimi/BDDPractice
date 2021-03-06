package runner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

/**
 * 
 * @author sparimi
 * Crated on May/25/2020
 */

@CucumberOptions(
		features = { "@rerun/failed_scenarios.txt" },
		
		plugin = { "json:target/cucumber.json","html:target/site/cucumber-pretty" },
		glue = {"steps"}		
)
public class ReRunner extends AbstractTestNGCucumberTests {

	@Override
	@DataProvider
	// @DataProvider (parallel = true) -- For parallel execution support (which is
	// not going to work for our code)
	public Object[][] scenarios() {
		return super.scenarios();
	}
}
