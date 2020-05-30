package org.hostanalytics.base;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

public class BaseUtil {
	
	public static WebDriver driver;
	
	public static ExtentReports extentReports;
	
	public static ExtentTest scenarioDef;
	
	public static ExtentTest features;
	
	public static final String reportLocation = System.getProperty("user.dir")+ "\\target\\htmlreports\\";

}
