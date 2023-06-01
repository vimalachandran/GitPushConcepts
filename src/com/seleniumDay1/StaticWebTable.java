package com.seleniumDay1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticWebTable {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\vimalachandran\\eclipse-workspace-7 AM\\SeleniumConcepts_7Am\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://nxtgenaiacademy.com/webtable/");

		System.out.println("----All Data-------");

		List<WebElement> AllData = driver.findElements(By.xpath("//table/tbody/tr/td"));
		for (WebElement all : AllData) {
			System.out.println(all.getText());
		}

		System.out.println("---------------------------------------------");

		System.out.println("-------Row data----------");
		List<WebElement> RowData = driver.findElements(By.xpath("//table/tbody/tr[6]/td"));
		for (WebElement row : RowData) {
			System.out.println(row.getText());
		}

	}

}
