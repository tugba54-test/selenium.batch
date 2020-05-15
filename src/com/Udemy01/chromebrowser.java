package com.Udemy01;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class chromebrowser {
         static WebDriver driver=new ChromeDriver();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Users\\16824\\eclipse-workspace2\\selenium.batch\\drivers\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("http://facebook.com");//url in the browser
//driver.findElement(By.id("email")).sendKeys("this is my first code");
	}

}
