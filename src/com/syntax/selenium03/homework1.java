package com.syntax.selenium03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class homework1{
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "drivers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		driver.findElement(By.name("firstname")).sendKeys("Kubra");
		
		driver.findElement(By.id("u_0_o")).sendKeys("Al");
		
		driver.findElement(By.name("reg_email__")).sendKeys("05339873452");
		
		driver.findElement(By.id("u_0_w")).sendKeys("876544");
		
		//driver.findElement(By.name("sex")).click();
		
		driver.findElement(By.name("websubmit")).click();
		
		
		
	}
	
}