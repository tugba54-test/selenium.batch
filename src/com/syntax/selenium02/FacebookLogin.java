package com.syntax.selenium02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {

	public static void main(String[] args) {
   System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
   
   WebDriver driver=new ChromeDriver();
   
   driver.get("https://www.facebook.com");
   driver.findElement(By.id("email")).sendKeys("123.yahoo.com");
   
   driver.findElement(By.id("pass")).sendKeys("1234");
   
   driver.findElement(By.id("u_0_b")).click();
   
   
   
   
   
   
   
   
   
	}

}
