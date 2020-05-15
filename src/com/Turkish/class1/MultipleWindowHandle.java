package com.Turkish.class1;

import org.openqa.selenium.By;

import com.Utilities.Ahmet.MyBase;

public class MultipleWindowHandle extends MyBase{
	public static String url="http://jiravm.centralus.cloudapp.azure.com:8081/index.html";
	public static void main(String[] args) throws InterruptedException {
		
		drivers("chrome");
		driver.get(url);
		
		driver.findElement(By.linkText("Alerts & Modals")).click();
		driver.findElement(By.linkText("Window Popup Model")).click();
		driver.findElement(By.linkText("Follow Instagram & Facebook")).click();
		Thread.sleep(3000);
		
		
	}

}
