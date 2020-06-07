package com.syntax.selenium09;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Utilities.Ahmet.MyBase;

public class task1Devam extends MyBase{

	public static void main(String[] args) {
		
		drivers("chrome");
		driver.get("https://www.aa.com/homePage.do");
		driver.findElement(By.xpath("//input[@id='aa-returningFrom']")).click();
		
WebElement month=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']"));
 String MonthText=month.getText();
		if(MonthText.equals("July")) {
			driver.findElement(By.xpath("//a[@class='ui-datepicker-next ui-corner-all']")).click();
			month.click();
		}
		List<WebElement>departCells=driver.findElements
				(By.xpath("//table[@class='ui-datepicker-calendar']//tbody/tr[2]/td"));
		
		for(WebElement departCell:departCells) {
			String departText=departCell.getText();
			if(departText.equals("7")) {
				departCell.click();
				break;
			}
		}

	}

}
