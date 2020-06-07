package com.syntax.Selenium10;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.Utilities.Ahmet.MyBase;

public class ExecutoeJava extends MyBase{

	public static void main(String[] args) throws InterruptedException {
		drivers("chrome");
		driver.get("http://166.62.36.207/humanresources/symfony/web/index.php/auth");
		
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("admin");
		WebElement pass=driver.findElement(By.xpath("//input[@name='txtPassword']"));
		pass.sendKeys("Hum@nhrm123");
		WebElement loginBtn=driver.findElement(By.xpath("//input[@id='btnLogin']"));
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		
		//change the background color of element
		js.executeScript("arguments[0].style.backgroundColor='red'", pass);
		
		//click on login btn using js
		js.executeScript("arguments[0].click()", loginBtn);
		
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,250)");
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,-250)");
		Thread.sleep(3000);
		driver.quit();
	}

}
