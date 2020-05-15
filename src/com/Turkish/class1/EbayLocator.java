package com.Turkish.class1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EbayLocator {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		
		
		driver.findElement(By.cssSelector("input[id='txtUsername']")).sendKeys("Admin");
		
		driver.findElement(By.cssSelector("input[id='txtPassword']")).sendKeys("admin123");
		
		driver.findElement(By.xpath("//input[contains(@id,'nLogin')]")).click();
		
		driver.findElement(By.linkText("Welcome Admin")).click();
		Thread.sleep(5000);
		driver.findElement(By.linkText("Logout")).click();
		Thread.sleep(5000);
		driver.close();
	}

}
