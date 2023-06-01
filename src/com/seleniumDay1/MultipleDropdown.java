package com.seleniumDay1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleDropdown {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\vimalachandran\\eclipse-workspace-7 AM\\SeleniumConcepts_7Am\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://www.leafground.com/pages/Dropdown.html");

		WebElement multiple = driver.findElement(By.xpath("(//select)[6]"));
		Select s = new Select(multiple);

		// selectMethods
		s.selectByIndex(1);
		s.selectByValue("2");
		s.selectByVisibleText("UFT/QTP");

		// deselect
		s.deselectByIndex(1);

		// getOptions()
		System.out.println("-----------All options-------------");
		List<WebElement> options = s.getOptions();
		for (WebElement allOptions : options) {
			System.out.println(allOptions.getText());
		}

		System.out.println("----------All selected Options----------");

		// getAllSelectedOptions()
		List<WebElement> al = s.getAllSelectedOptions();
		for (WebElement a2 : al) {
			System.out.println(a2.getText());
		}

		System.out.println("-------First selected programs----------");
		WebElement firstSelectedOption = s.getFirstSelectedOption();
		System.out.println(firstSelectedOption.getText());

		// deselectAll()
		s.deselectAll();

	}

}
