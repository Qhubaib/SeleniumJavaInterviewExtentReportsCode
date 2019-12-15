package Utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

/**
 * 
 * @author Qhubaib
 * This is screenshot method is used for ExtentReport screenshot attachment.
 *
 */

public class ScreenshotCapture {

	public static String getScreenshot(WebDriver driver) {

		TakesScreenshot screenshot = (TakesScreenshot) driver;

		File src = screenshot.getScreenshotAs(OutputType.FILE);
		
		String path = System.getProperty("user.dir")+"/screenshot/"+System.currentTimeMillis()+".png";
		
		File destination = new File(path);
		
		try {
			FileUtils.copyFile(src, destination);
		} catch (IOException e) {
			e.printStackTrace();
		}

		return path;
	}

}
