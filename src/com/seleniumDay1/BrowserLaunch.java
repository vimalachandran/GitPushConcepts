package com.seleniumDay1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch {

	public static void main(String[] args) {

		// To set the property for this class

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\vimalachandran\\eclipse-workspace-7 AM\\SeleniumConcepts_7Am\\Driver\\chromedriver.exe");
	
		//IllegalStateException
		
		//To Launch the browser
		WebDriver driver = new ChromeDriver();   //upcasting
	    //Interface             //class
	}

}
