package com.syntax.selenium12Sohil;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


import com.syntax.utils.CommonMethods;

public class ScreenShotDemo1 extends CommonMethods{

	public static void main(String[] args) throws InterruptedException {
		
		//url=http://166.62.36.207/humanresources/symfony/web/index.php/auth

		setUp();
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("Hum@nhrm123");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		Thread.sleep(2000);
		TakesScreenshot ts=(TakesScreenshot) driver;//downcasting
		File sourceFile=ts.getScreenshotAs(OutputType.FILE);
		
		try {
			FileUtils.copyFile(sourceFile, new File("screenshot/HRMS/loginAdmin.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		driver.quit();	
	}

}
