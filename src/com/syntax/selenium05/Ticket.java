package com.syntax.selenium05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Utilities.Ahmet.MyBase;

public class Ticket extends MyBase{

	public static String url="https://rahulshettyacademy.com/dropdownsPractise/";
	public static void main(String[] args) {
		
		drivers("chrome");
		driver.get(url);
		//*[@id="ctl00_mainContent_ddl_originStation1"]"
//		driver.findElement(By.xpath("//*[@id=\'ctl00_mainContent_ddl_originStation1\']")).click();
//		//date
//		driver.findElement(By.xpath("//*[@id=\'ctl00_mainContent_view_date1\']")).click();
//		driver.findElement(By.xpath("//a[@value='AMD']")).click();
//		driver.findElement(By.xpath("//*[@id=\'flightSearchContainer\']/div[6]/label")).click();
//		
//		driver.findElement(By.cssSelector("span[id='hrefIncAdt']")).click();
		
		driver.manage().window().maximize();
		WebElement from = driver.findElement(By.xpath("(//input[@value='Departure City'])[1]"));
		from.click();
		// Select select=new Select(from);
		// select.selectByVisibleText("Hyderabad (HYD)");
		driver.findElement(By.xpath("//div/ul[2]/li[6]/a")).click();
		driver.findElement(By.cssSelector("input[name*='ctl00_mainContent_ddl_destinationStation1_CTXT']")).click();
		driver.findElement(By.xpath("(//div/ul[3]/li[8]/a)[2]")).click();
		driver.findElement(By.xpath("//*[@id='ctl00_mainContent_view_date1']")).click();
		driver.findElement(By.cssSelector("div#divpaxinfo")).click();
		//Actions action=new Actions(driver);
		
		driver.findElement(By.cssSelector("#divpaxinfo")).click();
	
		
		
		
		
		
	}

}
