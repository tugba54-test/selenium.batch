package com.syntax.selenium09;

import org.openqa.selenium.By;

import com.Utilities.Ahmet.MyBase;

public class DeleteEmployee extends MyBase{

	public static void main(String[] args) {
		drivers("chrome");
		driver.get("http://166.62.36.207/humanresources/symfony/web/index.php/auth");
		
		driver.findElement(By.cssSelector("input[name*='sern']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("Hum@nhrm123");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		
	}

}
