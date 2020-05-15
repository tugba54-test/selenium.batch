package com.syntax.selenium05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.Utilities.Ahmet.MyBase;

//public static String url="https://demoqa.com/automation-practice-form/";
public class MultiSelectDropdown extends MyBase{

	public static void main(String[] args) throws InterruptedException {
		drivers("chrome");
		driver.get("https://demoqa.com/automation-practice-form/");
		
		WebElement multiSelectDD=driver.findElement(By.id("continentsmultiple"));
		Select select=new Select(multiSelectDD);
		boolean isMultiple=select.isMultiple();
		
		if(isMultiple) {
			select.selectByIndex(1);
			select.selectByIndex(3);
			select.selectByVisibleText("Africa");
			Thread.sleep(2000);
		}
//select.deselectAll();
		
		WebElement multiS=driver.findElement(By.id("selenium_commands"));
		Select select1=new Select(multiS);
		boolean isMulti=select1.isMultiple();
		if(isMulti) {
			select1.selectByIndex(1);
			select1.selectByVisibleText("Switch Commands");
		}
		
	}

}
