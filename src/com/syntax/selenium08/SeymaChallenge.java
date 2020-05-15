package com.syntax.selenium08;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Utilities.Ahmet.MyBase;
import com.syntax.utils.CommonMethods;

public class SeymaChallenge extends MyBase{

	public static void main(String[] args) {
		drivers("chrome");
		driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
		driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
		driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
		driver.findElement(By.id("ctl00_MainContent_login_button")).click();

		
		
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr"));

		for(WebElement newTable:rows) {
			String text=newTable.getText();
			if(text.contains("MasterCard")) {
				System.out.println(text);
				
			}else {
				System.out.println("test case failed");
			}
		}
		
		
		
		
		
	}

}
