package com.syntax.selenium08;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Utilities.Ahmet.MyBase;

public class AydinChallenge extends MyBase{

	public static void main(String[] args) {
		drivers("chrome");
		driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
		driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
		driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
		driver.findElement(By.id("ctl00_MainContent_login_button")).click();
     
		//nameleri yazdirma
		List<WebElement>allName=driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr/td[2]"));
		
		for(WebElement AName:allName) {
			String text=AName.getText();
			System.out.println(text);
		}
		
	}

}
