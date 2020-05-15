package com.syntaxseleniumRewiev01;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Utilities.Ahmet.MyBase;

public class getAllLinks extends MyBase{
	public static String url="http://the-internet.herokuapp.com/";
	public static void main(String[] args) {
		
		drivers("chrome");
		driver.get(url);
		List<WebElement>allLinks=driver.findElements(By.tagName("a"));
		
		int numOfLinks=allLinks.size();
		System.out.println(numOfLinks);
		
		
		for(WebElement Link:allLinks) {
			String textOfAllLink=Link.getText();
			System.out.println( textOfAllLink);
			String AllUrl=Link.getAttribute("href");
			System.out.println(AllUrl);
		}
		
		
	}
}