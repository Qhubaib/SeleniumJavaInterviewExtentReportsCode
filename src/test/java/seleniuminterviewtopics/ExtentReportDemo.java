package seleniuminterviewtopics;

import java.io.IOException;
import java.util.logging.Logger;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportDemo {
	
	ExtentHtmlReporter reporter;
	ExtentReports extent;
	ExtentReport reporting;

	
	@Test
	public void logintest()
	{
		reporter = new ExtentHtmlReporter("./Reports/munna.html");
		
		extent = new ExtentReports();
		
		extent.attachReporter(reporter);
		
		ExtentTest logger = extent.createTest("LoginTest");
		
		logger.log(Status.INFO, "This is login test");
		
		logger.log(Status.PASS, "Login to amazon");
		
		System.out.println("this is test() in @Test");
		
		extent.flush();
	}
	
	@Test
	public void validateHeader()
	{
		ExtentTest logger=extent.createTest("Validate Header");
		
		logger.log(Status.INFO, "This is validate Header method");
		
		logger.log(Status.FAIL, "Headers are not matched");
		
		System.out.println("This is validate header method");
		
		try {
			logger.addScreenCaptureFromPath("G:\\SQ AHMED\\Munna Photo.jpg");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		extent.flush();
	}
	
	@Test
	public void extentReportCommonMethod()
	{
		System.out.println("Extent Report Common Method Test");
		
		reporting = new ExtentReport();
		
		reporting.Report("extentReportCommonMethod");
		
		reporting.logger.log(Status.INFO, "This info is came from Extent Report Common Method");
		
		reporting.logger.log(Status.PASS, "The Common method is working fine without any errors");
		
		reporting.extent.flush();
	}
}
