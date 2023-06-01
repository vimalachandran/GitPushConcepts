package com.seleniumDay1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameConcepts {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\vimalachandran\\eclipse-workspace-7 AM\\SeleniumConcepts_7Am\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://demo.automationtesting.in/Frames.html");

		// main page---->frame
		driver.switchTo().frame("singleframe");

		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("selenium");

		// frame---->main page
		driver.switchTo().defaultContent();

		driver.findElement(By.xpath("(//a[@data-toggle='tab'])[2]")).click();

		// main page------>outer frame
		driver.switchTo().frame(1);

		// outer frame----->inner frame
		driver.switchTo().frame(0);

		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("selenium testing");

		// inner frame---->outer frame
		driver.switchTo().parentFrame();

		// outer frame---->main page
		driver.switchTo().defaultContent();

	}

}
