package seleniuminterviewtopics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoITClass {
	
	WebDriver driver;
	
	@Test
	public void autoitTest()
	{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(options);
		driver.get("file:///G:/SQ%20AHMED/fileupload.html");
		System.out.println(driver.getCurrentUrl());
		WebElement ele=driver.findElement(By.cssSelector("input#1"));
		ele.click();
		try {
			
			Runtime.getRuntime().exec("G:\\SQ AHMED\\AutoitFiles\\AutoitFile.exe");
		}
		catch(Exception e) {}
	}

}
