package com.syntax.selenium09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AselDeleteEmployee extends MyBase{

	public static void main(String[] args) {
//		TC 2: Delete Employee
//		Open chrome browser
//		Go to “http://166.62.36.207/humanresources/symfony/web/index.php/auth”
//		Login into the application
//		Add Employee
//		Verify Employee has been added
//		Go to Employee List
//		Delete added Employee
//		Quit the browser
		
		drivers("chrome");
		driver.get("http://166.62.36.207/humanresources/symfony/web/index.php/auth");
		
		driver.findElement(By.cssSelector("input[name*='sern']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("Hum@nhrm123");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.cssSelector("a[id='menu_pim_addEmployee']")).click();
		
		WebDriverWait wait=new 
		driver.findElement(By.cssSelector("input[id='btnAdd']")).click();
		driver.findElement(By.cssSelector("input[id='firstName']")).sendKeys("Kubra");
		driver.findElement(By.cssSelector("input[id='middleName']")).sendKeys("Zeynep");
		driver.findElement(By.cssSelector("input[id='lastName']")).sendKeys("Akca");
		
		WebElement EmpId=driver.findElement(By.cssSelector("input[id='employeeId']"));
		EmpId.clear();
		EmpId.sendKeys("7062");

        driver.findElement(By.cssSelector("input[id='btnSave']")).click();
	}

}


	}

}
