package com.syntax.selenium08;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Utilities.Ahmet.MyBase;
import com.syntax.utils.CommonMethods;

public class AhmetChallenge extends CommonMethods {
//url=http://demo.guru99.com/test/web-table-element.php
	public static void main(String[] args) {
//		drivers("chrome");
//		driver.get("http://demo.guru99.com/test/web-table-element.php");
//		WebElement bankOfCentral = driver.findElement(By.xpath("//table[@class='dataTable']//a[contains(text(),'Central Bank')]"));
//		bankOfCentral.click();
//		
//	
//		
//		String text = bankOfCentral.getText();
//		System.out.println(text);

		setUp();
		
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 WebElement baseTable = driver.findElement(By.tagName("table"));
		 
		    //To find third row of table
		   WebElement tableRow = baseTable.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[3]"));
          String rowtext = tableRow.getText();
		   System.out.println("Third row of table : "+rowtext);
		   
		    //to get 3rd row's 2nd column data
		    WebElement cellIneed = tableRow.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[3]/td[2]"));
		    String valueIneed = cellIneed.getText();
		    System.out.println("Cell value is : " + valueIneed);
		    //driver.close();
   }
}
