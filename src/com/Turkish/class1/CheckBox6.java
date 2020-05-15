package com.Turkish.class1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Utilities.Ahmet.MyBase;

public class CheckBox6 extends MyBase{

	public static void main(String[] args) throws InterruptedException {
		
		drivers("chrome");
		driver.get("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");
		driver.findElement(By.xpath("//input[@id='isAgeSelected']")).click();
		
		List<WebElement> checkbox=driver.findElements(By.xpath("//input[@class='cb1-element']"));
		for(WebElement list:checkbox) {
			list.click();
			Thread.sleep(3000);
		}
     //driver.quit();
	}

}
