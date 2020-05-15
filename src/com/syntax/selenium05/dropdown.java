package com.syntax.selenium05;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.Utilities.Ahmet.MyBase;

public class dropdown extends MyBase {
	
	public static void main(String[] args) throws InterruptedException {
		
		drivers("chrome");
		driver.get("http://166.62.36.207/syntaxpractice/basic-select-dropdown-demo.html");
	WebElement weekD=driver.findElement(By.id("select-demo"));
	Select sweekD=new Select(weekD);
	/*Selenium provides three diffferent ways to select 
	 * by index
	 * byvalue
	 * by 
	 */
	
	List<WebElement>options=sweekD.getOptions();
	System.out.println("Number of Options "+options.size());
	
	sweekD.selectByIndex(3);
			
	
	for(int i=0;i<options.size();i++) {
		sweekD.selectByIndex(i);
		Thread.sleep(1000);
	}
	
	sweekD.selectByVisibleText("Friday");
	Thread.sleep(2000);
	driver.quit();
	}

}
