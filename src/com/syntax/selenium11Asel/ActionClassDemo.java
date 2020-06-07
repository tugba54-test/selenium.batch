package com.syntax.selenium11Asel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.syntax.utils.CommonMethods;

public class ActionClassDemo extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		setUp();
		WebElement account=driver.findElement(By.xpath("/a[@id='nav-link-accountList']"));
		
		Actions action=new Actions(driver);
		action.moveToElement(account).perform();
		
		WebElement  element=driver.findElement(By.xpath("//div[@id='nav-flyout-ya-newCust']"));
		if(element.getText().contains("Start")) {
			System.out.println("Menu displayed");
		}else {
			System.out.println("Menu not displayed");
		}
		
		//how to right click
		action.contextClick(element).perform();//sag tiklamak icn
		
		//how to double click on element 
		WebElement searchBox=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		action.moveToElement(searchBox).click().sendKeys("Movies").doubleClick().perform();
		
		Thread.sleep(5000);
      tearDown();
	}

}
