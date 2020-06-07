package com.syntax.selenium12Sohil;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.syntax.utils.CommonMethods;
import com.syntax.utils.ConfigsReader;

public class HomeWork3 extends CommonMethods{

	public static void main(String[] args) {
		// TC 3: HRMS Login
//		Navigate to “http://166.62.36.207/humanresources/symfony/web/index.php/auth”
//		Login to the application by writing xpath based on “parent and child relation”
		
		setUp();
		driver.findElement(By.xpath("//div[@id='divUsername']/input")).sendKeys("Admin");
		driver.findElement(By.xpath("//div[@id='divPassword']/input")).sendKeys(ConfigsReader.getProperty("password"));
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File sourceFile=ts.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(sourceFile, new File("screenshot/HRMS/LogAD.jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
