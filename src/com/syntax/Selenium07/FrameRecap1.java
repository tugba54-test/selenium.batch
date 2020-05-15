package com.syntax.Selenium07;

import org.openqa.selenium.By;

import com.Utilities.Ahmet.MyBase;

public class FrameRecap1 extends MyBase{
public static String url="http://166.62.36.207/syntaxpractice/bootstrap-iframe.html";
	public static void main(String[] args) {
		drivers("chrome");
		driver.get(url);
		boolean isHomeDis=driver.findElement(By.xpath("//a[@href='./index.html']")).isDisplayed();
		System.out.println("Is home Link Displayed ? "+isHomeDis);
		
		driver.switchTo().frame("FrameOne");
		
		String welcomeMsg=driver.findElement(By.xpath("//h3[text()='Syntax Technologies']")).getText();
		System.out.println(welcomeMsg);
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame("FrameTwo");
		boolean isDispl=driver.findElement(By.xpath("//a[@class='enroll-btn']")).isEnabled();
		System.out.println("Is enroll buton displayed "+isDispl);
		
		driver.switchTo().defaultContent();
		
		
		
		
		
		
		
		
		
		

	}

}
