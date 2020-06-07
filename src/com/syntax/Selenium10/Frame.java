package com.syntax.Selenium10;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Utilities.Ahmet.MyBase;

public class Frame extends MyBase{
//Handling indepent
	public static void main(String[] args) {
		drivers("chrome");
		String url="http://uitestpractice.com/Students/Switchto";
		driver.get(url);
		//3 ways identify the frameindex-webelement -id or name
	//WebElement frame=driver.findElement(By.name("iframe_a"));
	driver.switchTo().frame("iframe_a");
		
		//driver.switchTo().frame(0);//with index
		WebElement textbook=driver.findElement(By.id("name"));
		textbook.sendKeys("frame practice");
		driver.switchTo().defaultContent();// focusing main page
		
		
		driver.findElement(By.id("alert")).click();
		//Alert alert=driver.switchTo().alert();
		//alert.accept();
	}

}
