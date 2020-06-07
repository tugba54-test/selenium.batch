package com.syntax.selenium09;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


import com.Utilities.Ahmet.MyBase;
public class screenShotDemo extends MyBase{

	public static void main(String[] args) {
		drivers("chrome");
		driver.get("http://166.62.36.207/humanresources/symfony/web/index.php/auth");
		
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("Hum@nhrm123");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();

		//validation that admin is logged in
		String welcometext=driver.findElement(By.id("welcome")).getText();
		if(welcometext.contains("Admin")) {
			System.out.println("Test pass");
		}else {
			System.out.println("Test Fail");
		}
		
		//How to TakeScreenshot using selenium
		//we can use TakeScreenshot interface
		//Step1: downcast webdriver to the type of TakeScreenshot
		TakesScreenshot ts=(TakesScreenshot) driver;//downcast our driver
		//call method getScreenshotAs and specify output type
		File screen=ts.getScreenshotAs(OutputType.FILE);
		try {
			//copy file to the specified destination and give name and extension
			FileUtils.copyFile(screen, new File("screenshot/HRMS/AdminLogin.jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		driver.quit();
					
	}

}
