package com.seleniumDay1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertMethods {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\vimalachandran\\eclipse-workspace-7 AM\\SeleniumConcepts_7Am\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://demo.automationtesting.in/Alerts.html");

		// simple alert
		driver.findElement(By.xpath("//button[@onclick='alertbox()']")).click();

		driver.switchTo().alert().accept();

		// confirm alert
		driver.findElement(By.xpath("(//a[@class='analystic'])[2]")).click();

		driver.findElement(By.xpath("//button[@onclick='confirmbox()']")).click();

		driver.switchTo().alert().dismiss();

		// prompt alert
		driver.findElement(By.xpath("(//a[@class='analystic'])[3]")).click();

		driver.findElement(By.xpath("//button[@onclick='promptbox()']")).click();

		Alert alert1 = driver.switchTo().alert();

		alert1.sendKeys("selenium");

		alert1.accept();

	}

}
