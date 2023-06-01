package com.seleniumDay1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebelementMethods {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\vimalachandran\\eclipse-workspace-7 AM\\SeleniumConcepts_7Am\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");

		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("vimala@gmail.com");

		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		boolean displayed = password.isDisplayed();
		System.out.println(displayed);
		System.out.println(password.isEnabled());
		password.sendKeys("data@123");

		driver.findElement(By.xpath("//button[@type='submit']")).click();

	}

}
