package com.syntax.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.syntax.utils.CommonMethods;

public class Facebook extends CommonMethods{

	public static void main(String[] args) throws InterruptedException {
		
		setUp();//facebook
		
		
		WebElement first=driver.findElement(By.xpath("//input[@name='firstname']"));
		sendText(first,"Hayriye");
		
		WebElement last=driver.findElement(By.xpath("//input[@name='lastname']"));
		sendText(last,"Al");
		
		WebElement mobile=driver.findElement(By.xpath("//input[@id='u_0_r']"));
		sendText(mobile,"1234567890");
		
		WebElement pass=driver.findElement(By.name("reg_passwd__"));
		sendText(pass,"Hay123");
		
		WebElement month=driver.findElement(By.xpath("//select[@id='month']"));
			
		Select smonth=new Select(month);
		smonth.selectByVisibleText("Feb");
		
		WebElement day=driver.findElement(By.xpath("//select[@id='day']"));
		selectDdValue( day,"8");
//		Select sday=new Select(day);
//		sday.selectByVisibleText("6");
		Thread.sleep(5000);
		
		WebElement year=driver.findElement(By.xpath("//select[@id='year']"));
		Select syear=new Select(year);
		syear.selectByVisibleText("1994");
		
		
		List<WebElement> gender=driver.findElements(By.cssSelector("span[data-type=radio]"));
		clickRadiOrCheckbox(gender, "Female");
		Thread.sleep(5000);
		tearDown();
		
		
		
	}

}
