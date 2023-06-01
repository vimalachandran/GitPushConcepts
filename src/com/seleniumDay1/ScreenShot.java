package com.seleniumDay1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\vimalachandran\\eclipse-workspace-7 AM\\SeleniumConcepts_7Am\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://www.leafground.com/");

		// TakesScreenshot ---->Interface
		TakesScreenshot ts = (TakesScreenshot) driver;

		// getScreenshotAs()
		File src = ts.getScreenshotAs(OutputType.FILE);

		// path
		File des = new File(
				"C:\\Users\\vimalachandran\\eclipse-workspace-7 AM\\SeleniumConcepts_7Am\\screenShot\\testleaf.png");

		// merge
		FileUtils.copyFile(src, des);
		
		

	}

}
