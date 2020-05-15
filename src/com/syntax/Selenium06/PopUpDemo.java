package com.syntax.Selenium06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import com.Utilities.Ahmet.MyBase;

public class PopUpDemo extends MyBase{
	
public static String url="http://uitestpractice.com/Students/Switchto";

	public static void main(String[] args) throws InterruptedException {
		
		drivers("chrome");
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@id='alert']")).click();
		Alert simpleAlert=driver.switchTo().alert();
		
		
		//Handling Simple alert/Pop-Ups
		String simpleAtext=simpleAlert.getText();
		System.out.println("this is a simple alert text : "+simpleAtext);
		simpleAlert.accept();
		
		//Handling Confirmation Alert
		driver.findElement(By.id("confirm")).click();
		Alert confirmAlert=driver.switchTo().alert();
		String confirmAText=confirmAlert.getText();
		System.out.println("This is a confirm alert text:: "+confirmAText);
		Thread.sleep(2000);
		confirmAlert.dismiss();
		
		
		//handling prompt  alerts/confirmation alerts by providing some confirmation
		//message
		String name="Alex";
		driver.findElement(By.id("prompt")).click();
		Alert promptAlert=driver.switchTo().alert();
		Thread.sleep(2000);
		System.out.println("This is Promp Alert text:  "+promptAlert.getText());
		promptAlert.sendKeys(name);
		promptAlert.accept();
		String text=driver.findElement(By.xpath("//div[@id='demo']")).getText();
		System.out.println("Text added to alert box::  "+text);
		
		if(text.contains(name)) {
			System.out.println("Text "+name+" was succesfullyy added");
		}else {
			System.out.println("Text "+name+" was not entered ");

		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		Thread.sleep(2000);
		driver.quit();
		
	}

}
