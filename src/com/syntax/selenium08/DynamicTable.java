package com.syntax.selenium08;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Utilities.Ahmet.MyBase;

public class DynamicTable extends MyBase {

	public static void main(String[] args) {

		drivers("chrome");
		driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
		driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
		driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
		driver.findElement(By.id("ctl00_MainContent_login_button")).click();

		String expectValue = "Bob Feather";
		
		//Find all rows of the table
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr"));

		for (int i = 0; i < rows.size(); i++) {//loop over list  based on the size.
			String rowText=rows.get(i+1).getText();//get text of list and skip first index(first row)
			System.out.println(rowText);
			
			if(rowText.contains(expectValue)) {//search for Bob Feather
				//get the rows of first column in the table
				driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//td[1]")).get(i).click();
				break;
			}}
		driver.close();
}}
