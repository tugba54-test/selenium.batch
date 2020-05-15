package com.syntax.selenium02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCommands {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
		   
		   driver.manage().window().maximize();
		   driver.get("https://www.facebook.com");
		   Thread.sleep(4000);
		   driver.navigate().to("https://www.google.com");
		   driver.navigate().refresh();

		   //driver.navigate().back();
		   Thread.sleep(4000);
		  driver.navigate().to("https://www.google.com");
				   

	}

}
