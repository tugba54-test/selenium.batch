package com.Udemy01;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindingDynamicXPath {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "drivers//geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://yahoo.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
	    driver.findElement(By.id("yschsp"))	.sendKeys("selenium");
		
		driver.close();
	}

}
