package seleniuminterviewtopics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RobotClass {
	
	WebDriver driver;
	
	@Test
	public void autoitTest() throws AWTException
	{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(options);
		driver.get("file:///G:/SQ%20AHMED/fileupload.html");
		System.out.println(driver.getCurrentUrl());
		WebElement ele=driver.findElement(By.cssSelector("input#1"));
		ele.click();
		String s = "path of file";
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		Clipboard clipboard = toolkit.getSystemClipboard();
		StringSelection str = new StringSelection(s);
		clipboard.setContents(str, null);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		
		
	}

}
