package com.syntax.seleniumAsel12;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.syntax.utils.CommonMethods;

public class YunusabiOzet extends CommonMethods{
	public static void main(String[] args) {
		
		//url=https://www.rahulshettyacademy.com/AutomationPractice/
		
		setUp();
		List<WebElement>radiobutton=driver.findElements(By.xpath("input[@class='radioButton']"));
		for (WebElement radio : radiobutton) {
			String value=radio.getAttribute("value");
			System.out.println(value);
			if(radio.isEnabled()) {
				System.out.println(value+" is clickbale ");
			}
			//if we are going to choose all radio button
		radio.click();
			break;
//			if(value.equals("value2")) {
//				radio.click();
//			}
			
		}
		
	}

	

}
