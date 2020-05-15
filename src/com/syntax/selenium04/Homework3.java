package com.syntax.selenium04;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework3 {
	public static String url="http://jiravm.centralus.cloudapp.azure.com:8081/index.html"; 
	public static void main(String[] args) throws InterruptedException {
		// TC 3: Syntax Demo input boxes count: 
//		Open chrome browser
//		Go to “http://jiravm.centralus.cloudapp.azure.com:8081/index.html”
//		Click on “Input Forms” links
//		Click on “Simple Form Demo” links
//		Get all input boxes from the page
//		Enter “Hello” to each text box
//		Close browser

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		
		WebDriver  driver=new ChromeDriver();
		System.getProperty(url);
		driver.get(url);
		
		driver.findElement(By.className("dropdown-toggle")).click();
		driver.findElement(By.linkText("Simple Form Demo")).click();	
		List<WebElement>allBox=driver.findElements(By.tagName("input"));
		
//		for(WebElement all:allBox) {
//			all.sendKeys("Hello");
//		}
		
//		Iterator<WebElement>it=allBox.iterator();
//		while(it.hasNext()) {
//			WebElement key=it.next();
//			key.sendKeys("Hello");
//		}
		Thread.sleep(2000);
		for(int i=0;i<allBox.size();i++) {
			allBox.get(i).sendKeys("Hello");
		}
		
	
		
  driver.quit();
	}

}
