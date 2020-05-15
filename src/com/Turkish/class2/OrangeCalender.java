package com.Turkish.class2;

import org.openqa.selenium.By;

import com.Utilities.Ahmet.MyBase;

public class OrangeCalender extends MyBase{
	
public static String url="http://opensource-demo.orangehrmlive.com/index.php/auth/login";
	public static void main(String[] args) throws InterruptedException {
		drivers("chrome");
		driver.get(url);
		
		driver.findElement(By.cssSelector("input[id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.cssSelector("input[id='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.cssSelector("input[id='btnLogin']")).click();
		
		driver.findElement(By.linkText("Leave")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Leave List")).click();
		
		//click on calender image
		//You can enter an input,image---->Xpath
		
		
	}

}
