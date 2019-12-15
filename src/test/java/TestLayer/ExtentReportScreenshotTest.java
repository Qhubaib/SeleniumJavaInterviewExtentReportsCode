package TestLayer;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.*;

import com.aventstack.extentreports.Status;

import Utilities.ScreenshotCapture;
import io.github.bonigarcia.wdm.WebDriverManager;
import seleniuminterviewtopics.ExtentReport;

public class ExtentReportScreenshotTest {
	
	WebDriver driver;
	ExtentReport report;
	
	@BeforeMethod
	public void setup()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(26, TimeUnit.SECONDS);
		driver.get("https://amazon.in");
	}
	
	@Test
	public void titleTest()
	{
		String title=driver.getTitle();
		System.out.println(title);
		report = new ExtentReport();
		report.Report("amazon title test");
		report.logger.log(Status.INFO, "This is amazon title test");
		Assert.assertEquals(title, "Amazon");
		report.logger.log(Status.FAIL, "Amazon title is not matched with expected value");		
	}
	
	@AfterMethod
	public void tearDown(ITestResult result)
	{
		if(ITestResult.FAILURE == result.getStatus())
		{
			String name=ScreenshotCapture.getScreenshot(driver);
			report.manualAddingScreenshot("Amazon title is not matched with expected value", name, "fail");
			report.extent.flush();
		}
		
		driver.close();
	}
	

}
