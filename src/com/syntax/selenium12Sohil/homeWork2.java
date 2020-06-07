package com.syntax.selenium12Sohil;

import org.openqa.selenium.By;

import com.syntax.utils.CommonMethods;

public class homeWork2 extends CommonMethods{

	public static void main(String[] args) throws InterruptedException {
		// TC 2: Upload file and Take Screenshot
//		Navigate to “http://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwFileUpload”
//		Upload file
//		Verify file got successfully uploaded and take screenshot
		setUp();
		Thread.sleep(3000);
		driver.findElement(By.id("gwt-debug-cwFileUpload")).click();
		String filepath="C:\\Users\\16824\\Ayse\\Fatma.txt";
		driver.findElement(By.cssSelector("button[class='gwt-Button']")).sendKeys(filepath);

	}

}
