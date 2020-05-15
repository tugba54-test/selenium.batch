package com.syntax.selenium03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {

	public static void main(String[] args) {
   String url="http://166.62.36.207/humanresources/symfony/web/index.php/auth/login";
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get(url);
		
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("12345");
				
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		
		//basliyr //a[contains(text(),'Welcome')]   this one is linktext!!!!!!!
				
	}

}
