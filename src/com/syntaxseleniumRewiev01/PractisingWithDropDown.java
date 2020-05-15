package com.syntaxseleniumRewiev01;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Utilities.Ahmet.MyBase;

public class PractisingWithDropDown extends MyBase {

	public static String url = "http://166.62.36.207/syntaxpractice/index.html";

	public static void main(String[] args) throws InterruptedException {
		//What is ul=Unorder link  list
		drivers("chrome");
		driver.get(url);
		List<WebElement>allDDs=driver.findElements(By.tagName("a"));
		for(WebElement oneDD:allDDs) {
			String dd=oneDD.getText();
			System.out.println(dd);
			
			if(oneDD.equals("List Box")) {
				oneDD.click();
			}
			
			if(oneDD.equals("Bootsrap List Box")) {
				oneDD.click();
			Thread.sleep(3000);
			List<WebElement> listOfDD=driver.findElements(By.tagName("li"));
			for(WebElement oneItem:listOfDD) {
				String item=oneItem.getText();
				
					
				if(oneItem.equals("Morbi leo risus")) {
					oneItem.click();
					break;
				}
			}
			
		}
		

	}

}}
