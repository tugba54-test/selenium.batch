package com.syntax.Selenium07;

import java.util.Set;

import org.openqa.selenium.By;

import com.Utilities.Ahmet.MyBase;

public class WindowhandleWithLoop4 extends MyBase{

	public static void main(String[] args) {
		drivers("chrome");
		driver.get("http://demoqa.com/automation-practice-switch-windows-2/");
		
		String signUpTitle=driver.getTitle();
		System.out.println("Main page title is "+signUpTitle);
		String parentWindowHandle=driver.getWindowHandle();//grab the handle of parent window
		
		for(int i=1;i<=3;i++) {
			driver.findElement(By.xpath("button[onclick='newMsgWin()']")).click();		
			}
		
		
		Set<String>allWindowHandles=driver.getWindowHandles();
		for(String handle:allWindowHandles) {
			System.out.println("id of the Window:"+handle);
			driver.switchTo().window(handle);
			driver.get("https://www.google.com");
			driver.close();
			
			
			
		}
	}

}
