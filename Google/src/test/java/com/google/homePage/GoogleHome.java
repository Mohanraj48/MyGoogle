package com.google.homePage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GoogleHome {
	
	@Test
	public void Homepage() throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "E:/Mohan/jarfiles/WebDrivers/Chrome/chromedriver_win32/chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		d.get("https://www.google.co.in");
		System.out.println(d.getTitle());
		Thread.sleep(4000);
		d.quit();	
	}

}
