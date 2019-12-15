package seleniuminterviewtopics;

import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReport {
	
	public ExtentHtmlReporter reporter;
	public ExtentReports extent;
	public ExtentTest logger;
	
	public void Report(String testName)
	{
		reporter = new ExtentHtmlReporter("./Reports/munna1.html");
		
		extent = new ExtentReports();
		
		extent.attachReporter(reporter);
		
		logger=extent.createTest(testName);
	}
	
	public void manualAddingScreenshot(String path)
	{
		try {
			logger.addScreenCaptureFromPath(path);
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
	
	public void manualAddingScreenshot(String details,String screenshotpath,String status)
	{
		try
		{			
			switch(status)
			{
				case "fail":
					logger.fail(details, MediaEntityBuilder.createScreenCaptureFromPath(screenshotpath).build());
					break;
				case "pass":
					logger.pass(details, MediaEntityBuilder.createScreenCaptureFromPath(screenshotpath).build());
					break;
				case "fatal":
					logger.fatal(details, MediaEntityBuilder.createScreenCaptureFromPath(screenshotpath).build());
					break;
				case "info":
					logger.info(details, MediaEntityBuilder.createScreenCaptureFromPath(screenshotpath).build());
					break;
				case "error":
					logger.error(details, MediaEntityBuilder.createScreenCaptureFromPath(screenshotpath).build());
					break;
				case "warning":
					logger.warning(details, MediaEntityBuilder.createScreenCaptureFromPath(screenshotpath).build());
					break;					
			}			
		}
		catch (IOException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
	}

}
