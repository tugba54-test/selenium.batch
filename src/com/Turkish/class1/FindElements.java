package com.Turkish.class1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Utilities.Ahmet.MyBase;

public class FindElements extends MyBase{

	
	public static void main(String[] args) {
		drivers("chrome");
		driver.get("https://ebay.com");
		
		List<WebElement> ebayLinkList=driver.findElements(By.tagName("a"));
		System.out.println("Size  of links "+ebayLinkList.size());
		
		for(int  i=0;i<ebayLinkList.size();i++) {
			String linktext=ebayLinkList.get(i).getText();
			if(!linktext.isEmpty()) {
			System.out.println(linktext);
		}
	}
		driver.quit();
}
}