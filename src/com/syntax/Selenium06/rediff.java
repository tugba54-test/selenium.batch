package com.syntax.Selenium06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import com.Utilities.Ahmet.MyBase;

public class rediff extends MyBase{

	public static void main(String[] args) {
		
		drivers("chrome");
		driver.get("http://www.rediff.com/");
		driver.findElement(By.linkText("Sign in")).click();// xpath--->//a[text()='Sign in']
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Alert alert=driver.switchTo().alert();
		String AText=alert.getText();
		alert.accept();
		System.out.println("Alert text is :: "+AText);
		
		driver.quit(); 
	}

}
