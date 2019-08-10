package com.mycompany.app;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GetGooglePageTitle {

	public static void main (String args[]) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C:/Users/kt/Downloads/chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("disable-infobars");
		WebDriver driver=new ChromeDriver(options);
		
		System.out.println("Launched chrome browser");
		driver.manage().window().maximize();
		System.out.println("Maximized window");
		driver.get("http://google.com");
		System.out.println("Title is :- "+driver.getTitle());
		Thread.sleep(5000);
		driver.quit();
	}
}
