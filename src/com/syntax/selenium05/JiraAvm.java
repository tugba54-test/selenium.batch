package com.syntax.selenium05;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.Utilities.Ahmet.MyBase;

public class JiraAvm extends MyBase{
public static String url="http://jiravm.centralus.cloudapp.azure.com:8081/index.html";
	public static void main(String[] args) throws InterruptedException {
		// TC 2: Select and Deselect values
//		TC 2: Select and Deselect values
//		Open chrome browser
//		Go to “http://jiravm.centralus.cloudapp.azure.com:8081/index.html”
//		Click on “Input Forms” links
//		Click on “Select Dropdown List” links
//		Select value from “Select List Demo” section
//		Verify value has been selected
//		Select 4 options from “Multi Select List Demo”
//		Deselect 1 of the option from the dd
//		Quit browser
		
		drivers("chrome");
		driver.get(url);
		driver.findElement(By.className("dropdown-toggle")).click();
		driver.findElement(By.linkText("Select Dropdown List")).click();
		WebElement All=driver.findElement(By.id("select-demo"));
		Select select=new Select(All);
		select.selectByIndex(5);
		boolean isSelected=driver.findElement(By.className("selected-value")).isDisplayed() ;
		
	System.out.println(isSelected);
		
	
	WebElement multiop=driver.findElement(By.id("multi-select"));
	Select select1=new Select(multiop);
	Thread.sleep(3000);
	select1.selectByValue("California");
	select1.deselectByVisibleText("New York");
	select1.selectByIndex(6);
	
	Boolean isMulti=select1.isMultiple();
	if(isMulti) {
		System.out.println("Multiple option is selected, test case is passed");
	}else {
		System.out.println("Multiple option is not selected, test case is not passed");

	}
select1.deselectByIndex(6);
driver.quit();
	}

}
