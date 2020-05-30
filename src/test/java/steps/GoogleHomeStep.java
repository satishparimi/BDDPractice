package steps;

import org.hostanalytics.base.BaseUtil;
import org.testng.Reporter;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class GoogleHomeStep {
	
	private BaseUtil base;
	
	public GoogleHomeStep(BaseUtil base) {
		
		this.base = base;
	}
	
	@Given("^background given step executed$")
	public void execute_background_step() {
		Reporter.log("Executed - Background step",true);
	}
	
	

	@Given("^Scenario1 step01 executed$")
	public void scenario1_step01() {
	
		Reporter.log("Scenario1 step01 executed",true);
	}
	
	@Then("Scenario1 step02 executed")
	public void scenario1_step02() {
	    
		Reporter.log("Scenario1 step02 executed",true);
	}
	
	
	
	@Given("^Scenario2 step01 executed$")
	public void scenario2_step01() {
		Reporter.log("Scenario2 step01 executed",true);
	}
	
	@Then("^Scenario2 step02 executed$")
	public void scenario2_step02() {
		Reporter.log("Scenario2 step02 executed",true);
	}
	
	
}
