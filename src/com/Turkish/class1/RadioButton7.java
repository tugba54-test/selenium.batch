package com.Turkish.class1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Utilities.Ahmet.MyBase;

public class RadioButton7 extends MyBase {

	public static void main(String[] args) throws InterruptedException {
		
		drivers("chrome");
		driver.get("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");
		driver.findElement(By.xpath("//*[@id=\'treemenu\']/li/ul/li[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Radio Buttons Demo")).click();
		
		List<WebElement> radiogender=driver.findElements(By.xpath("//input[@name='optradio']"));
		
		for(int  i=0;i<radiogender.size();i++) {
			String valueGen=radiogender.get(i).getAttribute("value");
			if(valueGen.equalsIgnoreCase("Female")) {
				radiogender.get(i).click();
				Thread.sleep(2000);
				
				
			}
		}

	}

}
