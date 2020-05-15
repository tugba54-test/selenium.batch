package com.syntax.selenium08;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Utilities.Ahmet.MyBase;

public class Mychallenge extends MyBase{

	public static void main(String[] args) {
		drivers("chrome");
		driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
		driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
		driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
		driver.findElement(By.id("ctl00_MainContent_login_button")).click();

		List<WebElement>Allrow=driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr"));
		  
		for(WebElement allR:Allrow) {
			String text=allR.getText();
			if(text.contains("Canada")) {
				System.out.println(text);
			}else {
				System.out.println("Test case Failed ");
			}
		}
		
		
		
	}

}
