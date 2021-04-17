package com.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test2 {

	@Test
	public void openChromeBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\selenium programs\\AutomationTesting\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		driver.close();
	}

}
