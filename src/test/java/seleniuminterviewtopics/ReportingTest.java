package seleniuminterviewtopics;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

public class ReportingTest {
	
	ExtentReport report;
	
	@Test
	public void reportTest()
	{
		System.out.println("This is in reporting test method");
		
		report = new ExtentReport();
		
		report.Report("This is Report Test");
		
		report.logger.log(Status.INFO, "This info is regarding to reporting test");
		
		report.logger.log(Status.PASS, "if it is able to generate the output - then it is got passed");
		
		report.manualAddingScreenshot("G:\\SQ AHMED\\Munna Photo.jpg");
		
		report.manualAddingScreenshot("Capture Screenshot of my photo", "G:\\SQ AHMED\\Munna Photo.jpg", "warning");
		
		report.extent.flush();
	}

}
