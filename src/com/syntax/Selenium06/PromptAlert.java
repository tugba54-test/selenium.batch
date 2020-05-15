package com.syntax.Selenium06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import com.Utilities.Ahmet.MyBase;

public class PromptAlert extends MyBase{

	public static void main(String[] args) {
		drivers("chrome");
		driver.get("http://toolsqa.com/handling-alerts-using-webdriver/");
		
		//click on prompt 
		driver.findElement(By.xpath("//*[text()='Prompt Pop Up']")).click();
		Alert PAlert=driver.switchTo().alert();
		//PAlert.sendKeys("hello");
		String PText=PAlert.getText();
		
		System.out.println(PText);
		if(PText.equals("Do you like toolsqa?")) {
			PAlert.sendKeys("hello");
		}
		
		
		PAlert.dismiss();

	}

}
