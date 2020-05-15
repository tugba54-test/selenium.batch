package com.syntax.selenium03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathHomework {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://newtours.demoaut.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[text()='REGISTER']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Burcu");
		
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Italyona");
		
		driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("1234567890");
		
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("burcu@gmail.com");
		
		driver.findElement(By.xpath("//input[@name='address1']")).sendKeys("345 morning way");
		
		driver.findElement(By.xpath("//input[@name='address2']")).sendKeys("apt A zip:123456");
		
		driver.findElement(By.xpath("//input[@name='city']")).sendKeys("Fortworth");
		
		driver.findElement(By.xpath("//input[@name='state']")).sendKeys("Dallas");
		
		driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys("123456");
		
		driver.findElement(By.xpath("//select[@name='country']")).click();
		
		driver.findElement(By.xpath("//option[@value='51']")).click();
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("italyona123");
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("brc456");
		
		driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys("brc456");
		
		driver.findElement(By.xpath("//input[@name='register']")).click();
		
		driver.close();
		
		
		
		
	}

}
