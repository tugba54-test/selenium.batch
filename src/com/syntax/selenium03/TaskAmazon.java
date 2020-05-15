package com.syntax.selenium03;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskAmazon {

	public static void main(String[] args) throws InterruptedException {

System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com");
		Thread.sleep(3000);
		List<WebElement>AllLink=driver.findElements(By.tagName("a"));
		
		int count=0;
		for(WebElement link:AllLink) {
			String text=link.getText();
			
			if(!text.isEmpty()) {
				System.out.println(text);
				count++;
			}
			
	}
		System.out.println("Total number of link with text is:: "+count);
       driver.quit();
}
}