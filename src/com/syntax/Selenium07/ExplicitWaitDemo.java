package com.syntax.Selenium07;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import com.Utilities.Ahmet.MyBase;

public class ExplicitWaitDemo extends MyBase{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		drivers("chrome");
		driver.get("http://166.62.36.207/syntaxpractice/dynamic-data-loading-demo.html");
		driver.manage().timeouts().implicitlyWait(1,TimeUnit.SECONDS);
		driver.findElement(By.className("btn btn-default")).click();
		
	boolean isDis=driver.findElement(By.xpath("p[contains(text(),'First Name')]")).isDisplayed();
	System.out.println("First Name is displayed "+isDis);

	}

}
