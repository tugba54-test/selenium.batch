package com.syntax.selenium02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HrmsLogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		String url="http://166.62.36.207/humanresources/symfony/web/index.php/auth/validateCredentials";
		
		   System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
		   
		   driver.get("http://www.facebook.com");
		   
		   driver.findElement(By.id("email")).sendKeys("syntaxtest@yahoo.com");
		   driver.findElement(By.id("pass")).sendKeys("0123456");
		   
		   driver.findElement(By.id("u_0_b")).click();
		   //driver.findElement(By.tagName("u_0_b")).click();
		   // a means anchor
		   Thread.sleep(3000);
		 // driver.findElement(By.linkText("Forgot Password")).click();
		driver.findElement(By.partialLinkText("Forgot")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
