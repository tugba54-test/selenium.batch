package com.syntax.selenium02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mercury {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get("http://http://newtours.demoaut.com");
		 
		 driver.findElement(By.linkText("Register here")).click();
		 
		 driver.findElement(By.name("firstName")).sendKeys("tugba");
		 
		 driver.findElement(By.name("lastName")).sendKeys("Akca");
		 
		 driver.findElement(By.name("phone")).sendKeys("2345678");
		 
		 driver.findElement(By.id("userName")).sendKeys("tugba54@yahoo.com");
		 
		 driver.findElement(By.name("address1")).sendKeys("2175 Nt state highway");
		 
		 driver.findElement(By.name("postalCode")).sendKeys("12345");
		 
		 driver.findElement(By.id("Submit")).click();
		 
		 
		 
		 
		 

	}

}
