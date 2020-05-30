package steps;

import org.hostanalytics.base.BaseUtil;
import org.testng.Assert;
import org.testng.Reporter;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;


/**
 * 
 * @author sparimi on 25/May/2020
 * 
 */

public class LoginStep extends BaseUtil{
	
	private  BaseUtil base;

    public LoginStep(BaseUtil base) {
        this.base = base;
    }

	@Given("^scenario1 step01 executed$")
	public void navigateToLoginPag() {
		Reporter.log("scenario1 step01 executed",true);		
		
	}

	@Then("^scenario1 step02 executed$")
	public void verifyLoginPage() {
		Reporter.log("scenario1 step02 executed",true);
		Assert.assertTrue(1 < 0);
	}
}
