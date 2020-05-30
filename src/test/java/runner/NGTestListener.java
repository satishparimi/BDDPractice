package runner;



import static org.hostanalytics.base.BaseUtil.features;

import java.io.IOException;

import org.hostanalytics.base.ExtentReportUtils;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.gherkin.model.Feature;

import io.cucumber.java.Scenario;

public class NGTestListener implements ITestListener{

	ExtentReportUtils extentReportUtil = new ExtentReportUtils();
	
	 @Override
	    public void onTestStart(ITestResult iTestResult) {
	        System.out.println("On test start");
	       
	    }

	    @Override
	    public void onTestSuccess(ITestResult iTestResult) {

	        System.out.println("On test Sucess");
	        System.out.println(iTestResult.getName()+"sucess test");
	    }

	    @Override
	    public void onTestFailure(ITestResult iTestResult) {
	        System.out.println("On test failure");

	        try{
	            extentReportUtil.ExtentReportScreenshot();
	        }catch (IOException e){
	            e.printStackTrace();
	        }
	    }

	    @Override
	    public void onTestSkipped(ITestResult iTestResult) {
	        System.out.println("On test skipped");
	    }

	    @Override
	    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {
	        System.out.println("On test percentage");
	    }

	    @Override
	    public void onStart(ITestContext iTestContext) {
	        System.out.println("On start");

	        extentReportUtil.ExtentReport();

	        //ToDo: Feature - Hard coding the feature name
	        features = extentReportUtil.extentReports.createTest(Feature.class, "Login Feature");

	    }

	    @Override
	    public void onFinish(ITestContext iTestContext) {
	        System.out.println("On finish");
	        extentReportUtil.FlushReport();
	    }
}
