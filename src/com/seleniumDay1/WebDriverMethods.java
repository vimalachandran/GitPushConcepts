package com.seleniumDay1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethods {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\vimalachandran\\eclipse-workspace-7 AM\\SeleniumConcepts_7Am\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");

		// locators

		// findElement()---->single element,return
		// type-Webelement,NoSuchElementException
		// findElements()--->multiple element,return type-List<Webelement>,List[]

		// 1.id
		WebElement emailbox = driver.findElement(By.id("email"));

		// name
		WebElement passWord = driver.findElement(By.name("pass"));

		// className
		WebElement text = driver.findElement(By.className("_8eso"));

		// tag name
		WebElement logo = driver.findElement(By.tagName("img"));

		// link text
		WebElement forgot = driver.findElement(By.linkText("Forgotten password?"));

		// partial link text
		WebElement forgotPassword = driver.findElement(By.partialLinkText("Forgotten"));

	}
}
