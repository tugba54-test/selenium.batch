package com.syntax.selenium12Sohil;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.syntax.utils.CommonMethods;

public class JavaScriptExecutorExpl5 extends CommonMethods{

	public static void main(String[] args) throws InterruptedException {
		//url=http://166.62.36.207/humanresources/symfony/web/index.php/auth/login

				setUp();
				driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
				 WebElement pass=driver.findElement(By.xpath("//input[@name='txtPassword']"));
				 pass.sendKeys("Hum@nhrm123");
				WebElement loginBtn=driver.findElement(By.className("button"));
				//loginBtn.click();
				Thread.sleep(2000);
				
				JavascriptExecutor js=(JavascriptExecutor)driver;
				
				//change the background color of an element
				js.executeScript("arguments[0].style.backgroundColor='red'", pass);
				
				//click on login btn using js
				js.executeScript("arguments[0].click()", loginBtn);
				
				js.executeScript("window.scrollBy(0,250, args)");
				
				Thread.sleep(5000);
				
				tearDown();
		

	}

}
