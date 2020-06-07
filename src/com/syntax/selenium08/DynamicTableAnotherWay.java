package com.syntax.selenium08;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Utilities.Ahmet.MyBase;

public class DynamicTableAnotherWay extends MyBase{

	public static void main(String[] args) {
		drivers("chrome");
		driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
		driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
		driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
		driver.findElement(By.id("ctl00_MainContent_login_button")).click();
	
////table[@class='SampleTable']/tbody/tr
		List<WebElement> rows=driver.findElements(By.xpath("//table[@class='SampleTable']/tbody/tr"));
		
		for(int i=1;i<=rows.size();i++) {
			String Text=rows.get(i).getText();//we can add -1 then we have to line 25 just i
			if(Text.contains("Samuel Clemens")) {//
				driver.findElement(By.xpath("//table[@class='SampleTable']/tbody/tr["+(i+1)+"]/td[1]")).click();
			}else {System.out.println("Bob feather not found");
			}}}
			//driver.quit();	
				
		}
		
		
		
		
		
		
		
		
		
		
		
		
	


