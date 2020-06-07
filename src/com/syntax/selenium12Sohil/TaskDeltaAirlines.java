package com.syntax.selenium12Sohil;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.syntax.utils.CommonMethods;

public class TaskDeltaAirlines extends CommonMethods{

	public static void main(String[] args) {
		//url=http://www.delta.com/
		
		setUp();
		driver.findElement(By.xpath("//div[@aria-invalid='false']")).click();
		boolean flag=false;
		while(!flag) {
		
		String DmonthText=driver.findElement(By.xpath("//span[@class='dl-datepicker-month-0']")).getText();
		if(DmonthText.equals("August")) {
			List<WebElement>DprtD=driver.findElements(By.xpath("//a[@class='dl-state-default']"));
			for(WebElement Dprtday:DprtD) {
				String DayText=Dprtday.getText();
				if(DayText.equals("9")) {
					Dprtday.click();
					
					flag=true;
					
					driver.findElement(By.xpath("//button[@class='donebutton']")).click();
					break;
				}
			}
		}else {
			driver.findElement(By.xpath("//a[@aria-label='Next']")).click();
		}
	}
	}
}
