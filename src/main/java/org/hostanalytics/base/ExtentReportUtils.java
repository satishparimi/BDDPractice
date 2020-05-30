package org.hostanalytics.base;

import java.io.IOException;

import org.hostanalytics.base.*;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

/**
 * 
 * @author sparimi, created on 25/May/2020
 *
 */
public class ExtentReportUtils extends BaseUtil {

	String fileName = reportLocation + "extentreport.html";

	public void ExtentReport() {

		// First is to create Extent Report
		extentReports = new ExtentReports();

		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter(fileName);
		htmlReporter.config().setTheme(Theme.DARK);
		htmlReporter.config().setDocumentTitle("BDD-Cucumber-Practice-Report");
		htmlReporter.config().setEncoding("utf-8");
		htmlReporter.config().setReportName("BDD Test Report");
	}
	
	
	 public void ExtentReportScreenshot() throws IOException {

	      /*  var scr = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	        Files.copy(scr.toPath(), new File(reportLocation + "screenshot.png").toPath());
	        scenarioDef.fail("details").addScreenCaptureFromPath(reportLocation + "screenshot.png");*/
	    }


	    public void FlushReport(){
	        extentReports.flush();
	    }

}
