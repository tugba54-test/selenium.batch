package com.syntax.selenium09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Utilities.Ahmet.MyBase;

public class Task1 extends MyBase{

	public static void main(String[] args) {
//		TC 1: Table headers and rows verification
//		Open chrome browser
//		Go to “https://www.aa.com/homePage.do”
//		Enter From and To
//		Select departure as May 14 of 2020
//		Select arrival as November 8 of 2020
//		Click on search
//        close browser
		drivers("chrome");
		driver.get("https://www.aa.com/homePage.do");
		WebElement fromCity=driver.findElement(By.cssSelector("input[id='reservationFlightSearchForm.originAirport']"));
		fromCity.clear();
		fromCity.sendKeys("DFW");
		
		WebElement toCity=driver.findElement(By.cssSelector("input[id='reservationFlightSearchForm.destinationAirport']"));
		toCity.sendKeys("MIA");
		
		
		
		
		
	}

}
