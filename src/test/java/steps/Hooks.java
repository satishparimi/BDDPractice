package steps;

import org.hostanalytics.base.BaseUtil;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;
import org.testng.Reporter;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;

public class Hooks extends BaseUtil {

	private BaseUtil base;

	public Hooks(BaseUtil base) {

		this.base = base;
	}

	/**
	 * 
	 * @param scenario
	 * @Purpose: launch browser for every scenario
	 */
	@Before
	public void beforeScenario(Scenario scenario) {

		System.out.println("***Executed Before Scenario....*** : "+scenario.getName());
		// TODO Launch Application using config files
		launchBrowser("Chrome");

	}

	@After
	public void afterScenario(Scenario scenario) {
		
		System.out.println("***Executed after scenario....***"+scenario.getName());
		
		if(scenario.isFailed()) {
			
			Reporter.log("Scenario : "+scenario.getName()+" is Failed",true);
		}else {
			
		}

		/*if (scenario.getStatus().PASSED != null) {
			System.out.println(scenario.getName() + " IS Passed");
		} else if (scenario.getStatus().FAILED != null) {
			System.out.println(scenario.getName() + " IS Failed");
			final byte[] screenshot = ((TakesScreenshot)base.driver).getScreenshotAs(OutputType.BYTES);
			//scenario.embed(screenshot, "image/png"); 
				scenario.attach(screenshot, "image/png", scenario.getName());
		} else if (scenario.getStatus().SKIPPED != null) {
			System.out.println(scenario.getName() + " IS Skipped");
		}*/

		base.driver.close();

	}

	@AfterStep
	public void afterStep(Scenario scenario) {
		// System.out.println("printing line number of step in feature file :
		// "+scenario.getId());

	}

	@BeforeStep
	public void beforeStep(Scenario scenario) {
		// System.out.println("printing scenario id before step : "+scenario.getId());
	}

	public void launchBrowser(String browserName) {

		if (browserName.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\lib\\chromedriver.exe");
			base.driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\lib\\geckodriver.exe");
			base.driver = new FirefoxDriver();
		} else {
			throw new RuntimeException("Browser Launch Failed, browser name : "+browserName);
		}
		
		base.driver.get("https://www.google.com");
		base.driver.manage().window().maximize();

	}

	
	public void takeScreenshot(Scenario scenario) {
		
		
	}

}
