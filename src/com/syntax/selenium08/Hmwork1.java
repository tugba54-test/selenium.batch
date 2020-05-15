package com.syntax.selenium08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Utilities.Ahmet.MyBase;

public class Hmwork1 extends MyBase{

	public static void main(String[] args) {
//		TC 1: Table headers and rows verification
//		Open chrome browser
//		Go to “http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx”
//		Login to the application
//		Verify customer “Susan McLaren” is present in the table
//		Click on customer details
//		Update customers last name and credit card info
//		Verify updated customers name and credit card number is displayed in table
		
		drivers("chrome");
		driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
		driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
		driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
		driver.findElement(By.id("ctl00_MainContent_login_button")).click();
		
		
		WebElement Susan=driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr[6]/td[2]"));
		System.out.println(Susan.isDisplayed());
		
		WebElement CDetail=driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr[6]/td[13]"));
		CDetail.click();
        WebElement name=driver.findElement(By.cssSelector("input[id='ctl00_MainContent_fmwOrder_txtName']"));
		name.clear();
		name.sendKeys("Susan Malkoc");
		driver.findElement(By.cssSelector("input[value='Visa']")).click();
		
		 WebElement  date=driver.findElement(By.cssSelector("input[id='ctl00_MainContent_fmwOrder_TextBox1']"));
		date.clear();
		date.sendKeys("04/23");
		driver.findElement(By.cssSelector("a[id='ctl00_MainContent_fmwOrder_UpdateButton']")).click();

		WebElement Row6=driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr[6]"));
		
		String text=Row6.getText();
		if(text.contains("Susan Malkoc") && text.contains("04/23")) {
			System.out.println("Test case Pass");
		}else {
			System.out.println("Failed");
		}
			
		
		
		
}
}