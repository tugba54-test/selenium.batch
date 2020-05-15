package com.syntax.selenium02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;

public class Firefox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://newtours.demoaut.com/");
		 driver.findElement(By.linkText("Register here")).click();
		 driver.findElement(By.name("FirstName")).sendKeys("Mahmut");
		 driver.findElement(By.name("Lastname")).sendKeys("abc");
		 

	}

}
