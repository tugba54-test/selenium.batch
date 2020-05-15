package com.syntax.selenium04;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class allLinksEBay {

	public static void main(String[] args) {

		
System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.ebay.com");
		
		List<WebElement>allLinks=driver.findElements(By.tagName("a"));//to get all links
		//anchor a because link-->find Elements using TagName
		System.out.println(allLinks.size());
		
		int count=0;
		int EmptyCount=0;
		for(WebElement link:allLinks) {
			String text=link.getText();
			
			if(!text.isEmpty()) {
				System.out.println(text);
				count++;
			}else {
				System.out.println("it is empty");
				EmptyCount++;
			}
			
		}
		
		
		System.out.println("Total number of link with text is:: "+count);
		System.out.println("Total number of link with text is:: "+EmptyCount);
		
		driver.quit();
		
		
	}
	
	
	

}
