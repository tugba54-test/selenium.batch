package com.syntax.Selenium07;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import com.Utilities.Ahmet.MyBase;

public class WaitDemo5 extends MyBase{
	public static String url="http://jiravm.centralus.cloudapp.azure.com:8081/index.html";
	public static void main(String[] args) {
		
		drivers("chrome");
		driver.get(url);
		boolean isHomeDis=driver.findElement(By.xpath("//a[@href='./index.html/]'")).isDisplayed();
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
System.out.println(isHomeDis);


driver.quit();
	}

}
