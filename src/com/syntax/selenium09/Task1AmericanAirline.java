package com.syntax.selenium09;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Utilities.Ahmet.MyBase;

public class Task1AmericanAirline extends MyBase {

	public static void main(String[] args) throws InterruptedException {
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
		WebElement fromCity = driver
				.findElement(By.cssSelector("input[id='reservationFlightSearchForm.originAirport']"));
		fromCity.clear();
		fromCity.sendKeys("DFW");

		WebElement toCity = driver
				.findElement(By.cssSelector("input[id='reservationFlightSearchForm.destinationAirport']"));
		toCity.sendKeys("MIA");

		driver.findElement(By.xpath("//input[@id='aa-leavingOn']")).click();

		Thread.sleep(2000);

		boolean found = false;
		while (!found) {
			String DMonth = driver.findElement(By.xpath("//div[contains(@class, 'ui-corner-left')]/div")).getText();
			if (DMonth.equals("August 2020")) {
				List<WebElement> days = driver.findElements(By.xpath("//td[@data-handler='selectDay']"));
				for (WebElement day : days) {
					String DayText = day.getText();
					if (DayText.equals("16")) {
						day.click();
						found = true;
						break;
					}

				}
			}else {
				driver.findElement(By.xpath("//a[@data-handler='next']")).click();

			}

		}
		
		driver.findElement(By.cssSelector("input[id='aa-returningFrom']")).click();
		found=false;
		
		
		while(!found) {
			String MonthText=driver.findElement(By.xpath("//div[contains(@class, 'ui-corner-left')]/div")).getText();
			if(MonthText.equals("November 2020")) {
				List<WebElement> Rdays = driver.findElements(By.xpath("//td[@data-handler='selectDay']"));
				for(WebElement Rtrndays:Rdays) {
					if(Rtrndays.getText().equals("25")){
						Rtrndays.click();
						found=true;
						break;
					}
					
				}
			}else {
				driver.findElement(By.xpath("//a[@data-handler='next']")).click();
			}
			
		}
		
		driver.quit();
	}}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	

